package com.example.assignment3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Assignment3ApplicationTests {
	ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext(new String[]{"classpath:spring/application-context.xml","classpath:spring/model-context.xml"});
	@Test
	void contextLoads() {
	}

}
