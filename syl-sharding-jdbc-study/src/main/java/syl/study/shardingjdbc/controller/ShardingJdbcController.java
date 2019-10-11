package syl.study.shardingjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author 史彦磊
 * @Date 2019-10-11 20:21
 */
@RestController
public class ShardingJdbcController {




    @GetMapping("/hello")
    public String hello(){
        return "hello sharding jdbc";
    }



}
