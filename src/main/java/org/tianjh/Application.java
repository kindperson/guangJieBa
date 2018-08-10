package org.tianjh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/10
 * @since: 1
 * description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.tianjh")
public class Application implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;
    public static void  main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("我连接的数据库方式:" +dataSource);
    }
}
