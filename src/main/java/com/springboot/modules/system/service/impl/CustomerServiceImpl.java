package com.springboot.modules.system.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.springboot.modules.system.dto.CustomerDto;
import com.springboot.modules.system.entity.Customer;
import com.springboot.modules.system.entity.Resource;
import com.springboot.modules.system.mapper.CustomerMapper;
import com.springboot.modules.system.query.CustomerQuery;
import com.springboot.modules.system.service.CustomerService;
import com.springboot.modules.system.service.ResourceService;
import com.springboot.utils.PageResultSet;

import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private ResourceService resourceService;

    @Override
    public PageResultSet<CustomerDto> findByPage(CustomerQuery customerQuery) {
        PageHelper.offsetPage(customerQuery.getOffset(), customerQuery.getLimit());
        if(!StringUtils.isEmpty(customerQuery.getOrderBy())) {
            PageHelper.orderBy(customerQuery.getOrderBy());
        }
        Weekend<Customer> example = Weekend.of(Customer.class);
        WeekendCriteria<Customer, Object> criteria = example.weekendCriteria();
        if(!StringUtils.isEmpty(customerQuery.getOrder())) {
            criteria.andLike(Customer::getName,"%" + customerQuery.getName() + "%");
        }
        /*if(!StringUtils.isEmpty(orderQuery.getDescription())) {
            criteria.andLike(Order::,"%" + orderQuery.getDescription() + "%");
        }*/
        PageResultSet<CustomerDto> resultSet = new PageResultSet<>();
        List<CustomerDto> dtoList = new ArrayList<>();
        customerMapper.selectByExample(example).forEach(r -> {
            CustomerDto dto = new CustomerDto(r);
            //dto.setResourceNames(getResourceNames(r.getResourceIdList()));
            dtoList.add(dto);
        });
        long total = customerMapper.selectCountByExample(example);
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
    public void createCustomer(Customer customer) {
    	customerMapper.insertSelective(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Long customerId) {
        customerMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public Customer findOne(Long customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.selectAll();
    }

    @Override
    public Set<String> findCustomers(Long... customerIds) {
        Set<String> customers = new HashSet<>();
        for (Long customerId : customerIds) {
            Customer customer = findOne(customerId);
            if (customer != null) {
            	customers.add(customer.getName());
            }
        }
        return customers;
    }

	@Override
	public Set<String> findPermissions(Long[] customerIds) {
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
