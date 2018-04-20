package com.yulike.dm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:applicationContext-dm-bk-beans.xml"})
@MapperScan({"com.yulike.dm.dao"})
public class DmBkApp {
    public static void main(String[] args){
        SpringApplication.run(DmBkApp.class, args);
    }
}
