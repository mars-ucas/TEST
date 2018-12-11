package com.springboot.modules.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.springboot.modules.system.dto.OrderDto;
import com.springboot.modules.system.entity.Resource;
import com.springboot.modules.system.entity.Order;
import com.springboot.modules.system.mapper.OrderMapper;
import com.springboot.modules.system.query.OrderQuery;
import com.springboot.modules.system.service.ResourceService;
import com.springboot.modules.system.service.OrderService;
import com.springboot.utils.PageResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ResourceService resourceService;

    @Override
    public PageResultSet<OrderDto> findByPage(OrderQuery orderQuery) {
        PageHelper.offsetPage(orderQuery.getOffset(), orderQuery.getLimit());
        if(!StringUtils.isEmpty(orderQuery.getOrderBy())) {
            PageHelper.orderBy(orderQuery.getOrderBy());
        }
        Weekend<Order> example = Weekend.of(Order.class);
        WeekendCriteria<Order, Object> criteria = example.weekendCriteria();
        if(!StringUtils.isEmpty(orderQuery.getOrder())) {
            criteria.andLike(Order::getReportNum,"%" + orderQuery.getReportNum() + "%");
        }
        /*if(!StringUtils.isEmpty(orderQuery.getDescription())) {
            criteria.andLike(Order::,"%" + orderQuery.getDescription() + "%");
        }*/
        PageResultSet<OrderDto> resultSet = new PageResultSet<>();
        List<OrderDto> dtoList = new ArrayList<>();
        orderMapper.selectByExample(example).forEach(r -> {
            OrderDto dto = new OrderDto(r);
            //dto.setResourceNames(getResourceNames(r.getResourceIdList()));
            dtoList.add(dto);
        });
        long total = orderMapper.selectCountByExample(example);
        resultSet.setRows(dtoList);
        resultSet.setTotal(total);
        return resultSet;
    }

    private String getResourceNames(Collection<Long> resourceIds) {
        if (CollectionUtils.isEmpty(resourceIds)) {
            return "";
        }
        StringBuilder s = new StringBuilder();
        for (Long resourceId : resourceIds) {
            Resource resource = resourceService.findOne(resourceId);
            if (resource != null) {
                s.append(resource.getName());
                s.append(",");
            }
        }
        if (s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
        }
        return s.toString();
    }

    @Override
    @Transactional
    public void createOrder(Order order) {
        orderMapper.insertSelective(order);
    }

    @Override
    @Transactional
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    @Transactional
    public void deleteOrder(Long orderId) {
        orderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public Order findOne(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public List<Order> findAll() {
        return orderMapper.selectAll();
    }

    @Override
    public Set<String> findOrders(Long... orderIds) {
        Set<String> orders = new HashSet<>();
        for (Long orderId : orderIds) {
            Order order = findOne(orderId);
            if (order != null) {
                orders.add(order.getReportNum());
            }
        }
        return orders;
    }

	@Override
	public Set<String> findPermissions(Long[] orderIds) {
		// TODO Auto-generated method stub
		return null;
	}

   /* @Override
    public Set<String> findPermissions(Long[] orderIds) {
        Set<Long> resourceIds = new HashSet<>();
        for (Long orderId : orderIds) {
            Order order = findOne(orderId);
            if (order != null) {
                resourceIds.addAll(order.getResourceIdList());
            }
        }
        return resourceService.findPermissions(resourceIds);
    }*/
}
