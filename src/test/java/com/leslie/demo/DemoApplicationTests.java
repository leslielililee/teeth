package com.leslie.demo;

import com.leslie.demo.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestController testController;

    @Test
    void contextLoads() {
        System.out.println(testController.getMessage());;
    }

}
