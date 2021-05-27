package com.testcy.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestJuint5 {

    @Test
    @DisplayName("测试执行中。。。")
    public void test01(){
        System.out.println("测试执行中。。。");
        Assertions.assertTrue(true);
    }

}
