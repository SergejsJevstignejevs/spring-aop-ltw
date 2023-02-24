package com.sj;

import com.sj.utilities.Watch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Check used JVM arguments
        System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());
        //Java class LTW config
        //ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        //XML LTW config
        ApplicationContext context = new ClassPathXmlApplicationContext("config/aop-xml-conf.xml");
        Watch watch = context.getBean(Watch.class);
        watch.sleeping(3000);
    }
}