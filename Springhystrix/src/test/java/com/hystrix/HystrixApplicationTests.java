package com.hystrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HystrixApplicationTests {

    @Autowired
    HystrixApplication hystrixApplication;

    @Test
    public void contextLoads() {
      Class Class = hystrixApplication.getClass();
       Method[] methods= Class.getDeclaredMethods();
        for(  Method method: methods) {
            System.out.println(method.getName());
            System.out.println( Thread.currentThread().getStackTrace()[2].getMethodName());
            Annotation[]  annotations=  method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        }
    }

}

