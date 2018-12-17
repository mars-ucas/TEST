package com.springboot.modules.system.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.core.annotation.SystemLog;
import com.springboot.modules.system.dto.OrderDto;
import com.springboot.modules.system.entity.Order;
import com.springboot.modules.system.query.OrderQuery;
import com.springboot.modules.system.service.OrderService;
import com.springboot.modules.system.service.ResourceService;
import com.springboot.utils.BaseController;
import com.springboot.utils.PageResultSet;
import com.springboot.utils.Result;

import javax.validation.Valid;
import java.util.Arrays;

/**
 * 
 * @Description： 订单管理
 * @author [ xl ] on [2018年12月12日上午9:30:52]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ResourceService resourceService;

    @GetMapping
    // 权限暂时注释，界面会报权限错误
    //@RequiresPermissions("sys_order:view")
    public String page(Model model) {
        setCommonData(model);
        return "system/order";
    }

    @ResponseBody
    @RequestMapping("/list")
    // 权限暂时注释，界面会报权限错误
    //@RequiresPermissions("sys_order:view")
    public PageResultSet<OrderDto> list(OrderQuery orderQuery) {
        return orderService.findByPage(orderQuery);
    }

    @ResponseBody
    //@RequiresPermissions("order:create")
    @SystemLog("订单管理创建订单")
    @PostMapping("/create")
    public Result<?> create(@Valid Order order) {
        orderService.createOrder(order);
        return Result.success();
    }

    @ResponseBody
    //@RequiresPermissions("order:update")
    @SystemLog("订单管理更新订单")
    @PostMapping("/update")
    public Result<?> update(@Valid Order order) {
        orderService.updateOrder(order);
        return Result.success();
    }

    @ResponseBody
    //@RequiresPermissions("order:delete")
    @SystemLog("订单管理删除订单")
    @PostMapping("/delete")
    public Result<?> delete(@RequestParam("id") Long[] ids) {
        Arrays.asList(ids).forEach(id-> orderService.deleteOrder(id));
        return Result.success();
    }

    private void setCommonData(Model model) {
        model.addAttribute("resourceList", resourceService.findAll());
    }

}
