package com.springboot.modules.system.service;

import java.util.List;
import java.util.Set;

import com.springboot.modules.system.dto.OrderDto;
import com.springboot.modules.system.entity.Order;
import com.springboot.modules.system.query.OrderQuery;
import com.springboot.utils.PageResultSet;

public interface OrderService {

    PageResultSet<OrderDto> findByPage(OrderQuery orderQuery);

    void createOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Long orderId);

    Order findOne(Long orderId);

    List<Order> findAll();

    /**
              * 根据订单编号获取所有订单
     * @param orderIds
     * @return
     */
    Set<String> findOrders(Long... orderIds);

    /**
     * 根据角色编号得到权限字符串列表
     * @param orderIds
     * @return
     */
    Set<String> findPermissions(Long[] orderIds);
}
