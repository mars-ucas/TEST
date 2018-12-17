package com.springboot.modules.system.web;

import java.util.Arrays;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.core.annotation.SystemLog;
import com.springboot.modules.system.dto.CustomerDto;
import com.springboot.modules.system.entity.Customer;
import com.springboot.modules.system.query.CustomerQuery;
import com.springboot.modules.system.service.CustomerService;
import com.springboot.modules.system.service.ResourceService;
import com.springboot.utils.BaseController;
import com.springboot.utils.PageResultSet;
import com.springboot.utils.Result;

/**
 * 
 * @Description： 订单管理
 * @author [ xl ] on [2018年12月12日上午9:30:52]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ResourceService resourceService;

    @GetMapping
    // 权限暂时注释，界面会报权限错误
    //@RequiresPermissions("sys_customer:view")
    public String page(Model model) {
        setCommonData(model);
        return "system/customer";
    }

    @ResponseBody
    @RequestMapping("/list")
    // 权限暂时注释，界面会报权限错误
    //@RequiresPermissions("sys_customer:view")
    public PageResultSet<CustomerDto> list(CustomerQuery customerQuery) {
        return customerService.findByPage(customerQuery);
    }

    @ResponseBody
    //@RequiresPermissions("customer:create")
    @SystemLog("创建新客户")
    @PostMapping("/create")
    public Result<?> create(@Valid Customer customer) {
        customerService.createCustomer(customer);
        return Result.success();
    }

    @ResponseBody
    //@RequiresPermissions("customer:update")
    @SystemLog("更新客户信息")
    @PostMapping("/update")
    public Result<?> update(@Valid Customer customer) {
        customerService.updateCustomer(customer);
        return Result.success();
    }

    @ResponseBody
    //@RequiresPermissions("customer:delete")
    @SystemLog("删除客户信息")
    @PostMapping("/delete")
    public Result<?> delete(@RequestParam("id") Long[] ids) {
        Arrays.asList(ids).forEach(id-> customerService.deleteCustomer(id));
        return Result.success();
    }

    private void setCommonData(Model model) {
        model.addAttribute("resourceList", resourceService.findAll());
    }

}
