package com.example.mspring;

import com.example.mspring.container.BeanFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SimpleBeanContainerTest {
    @Test
    public void testGetBean(){
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService",new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
//        assertThat()断言测试，测试helloService是否不为空
        assertThat(helloService).isNotNull();
//        测试helloService的sayhelllo()方法和hello是否一致
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }
    class HelloService{
        public String sayHello(){
            System.out.println("hello");
            return "hello";
        }

    }
}
