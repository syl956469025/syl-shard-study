package syl.study.shardingjdbc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import syl.study.shardingjdbc.model.TOrder;
import syl.study.shardingjdbc.service.ITOrderService;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 史彦磊
 * @since 2019-10-11
 */
@RestController
@RequestMapping("/t-order")
public class TOrderController {



    @Autowired
    ITOrderService itOrderService;

    @GetMapping("/add")
    public String addOrder(Long orderId,Long userId){
        TOrder order = new TOrder();
        order.setCreateTime(LocalDateTime.now());
        order.setOrderId(orderId);
        order.setUserId(userId);
        this.itOrderService.save(order);
        return "success";

    }

}
