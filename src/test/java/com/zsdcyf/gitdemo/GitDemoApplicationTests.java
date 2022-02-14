package com.zsdcyf.gitdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("代码冲突master");
        System.out.println("Hello git");
        System.out.println("Update git");
        System.out.println("hot fix");
    }

}
