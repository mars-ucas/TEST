package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @Description： 功能描述
 * @author [ xl] on [2018年10月24日下午5:25:02]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@SpringBootApplication(exclude = {QuartzAutoConfiguration.class})
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.springboot"})

public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成!");
    }
}
