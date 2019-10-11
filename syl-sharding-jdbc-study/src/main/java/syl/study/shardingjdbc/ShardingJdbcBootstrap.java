package syl.study.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * 描述：
 *
 * @author 史彦磊
 * @Date 2019-10-11 20:13
 */
@SpringBootApplication
@MapperScan("syl.study.shardingjdbc.mapper")
public class ShardingJdbcBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcBootstrap.class,args);
    }

    DataSource dataSource;


}
