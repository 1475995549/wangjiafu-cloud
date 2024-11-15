package com.wangjiafu.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author wangjiafu
 * @Date 2024/11/14 上午9:30
 * @Version 1.0
 */
@EnableFeignClients(basePackages = {"com.wangjiafu"})
@SpringBootApplication
@RefreshScope
public class SpringDocApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDocApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");

        /*while(true) {
            String userName = applicationContext.getEnvironment().getProperty("springdoc.gatewayUrl");
            String userAge = applicationContext.getEnvironment().getProperty("springdoc.info.title");
            //获取当前部署的环境
            String currentEnv = applicationContext.getEnvironment().getProperty("spring.profiles.active");
            System.err.println("in "+currentEnv+" enviroment; "+"user name :" + userName + "; age: " + userAge);
            TimeUnit.SECONDS.sleep(1);
        }*/
    }
}
