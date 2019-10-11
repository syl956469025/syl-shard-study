package syl.study.shardingjdbc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import syl.study.shardingjdbc.model.TOrder;
import syl.study.shardingjdbc.model.TUser;
import syl.study.shardingjdbc.service.ITOrderService;
import syl.study.shardingjdbc.service.ITUserService;

import java.time.LocalDate;
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
@RequestMapping("/t-user")
public class TUserController {


    @Autowired
    ITUserService itUserService;

    @GetMapping("/add")
    public String addUser(){
        LocalDate date = LocalDate.parse("2018-01-01");
        for (long i = 0; i < 12; i++) {

            TUser user = new TUser();
            user.setUserId(i);
            user.setAge((int)i);
            user.setBirth(date);
            user.setUsername("username"+i);
            this.itUserService.save(user);
            date = date.plusMonths(1);

        }

        return "success";

    }

}
