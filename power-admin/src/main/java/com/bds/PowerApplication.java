package com.bds;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/23 16:14<br/>
 *
 * @author Jack.Lu<br />
 * @since JDK 1.8
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PowerApplication.class,args);
    }
}
