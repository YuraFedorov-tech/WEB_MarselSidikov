package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context= new ClassPathXmlApplicationContext("ru.yura\\context.xml");
//        MessageRenderer renderer= (MessageRenderer) context.getBean("renderer");
//        renderer.printMesssage();
        ApplicationContext context=new ClassPathXmlApplicationContext("ru.yura\\context.xml");
        IndependentMessageRenderer renderer= (IndependentMessageRenderer) context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
