package com.mgs.restframework;

import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
//@SpringBootTest
public abstract class CucumberStepDefinitions {
}
