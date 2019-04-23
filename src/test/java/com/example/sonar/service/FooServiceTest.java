package com.example.sonar.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@SpringBootTest
public class FooServiceTest {
    @Autowired
    private FooService fooService;

    @Test
    void test() {
        Assertions.assertThat(fooService.hello()).isEqualTo(":sake:");
    }

}
