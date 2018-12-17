package com.springboot.modules.system.service;

import java.util.List;
import java.util.Set;

import com.springboot.modules.system.dto.CustomerDto;
import com.springboot.modules.system.entity.Customer;
import com.springboot.modules.system.query.CustomerQuery;
import com.springboot.utils.PageResultSet;

public interface CustomerService {

    PageResultSet<CustomerDto> findByPage(CustomerQuery customerQuery);

    void createCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long customerId);

    Customer findOne(Long customerId);

    List<Customer> findAll();

    /**
              * 根据客户编号得到客户标识符列表
     * @param customerIds
     * @return
     */
    Set<String> findCustomers(Long... customerIds);

    /**
             * 根据客户编号得到权限字符串列表
     * @param customerIds
     * @return
     */
    Set<String> findPermissions(Long[] customerIds);
}
