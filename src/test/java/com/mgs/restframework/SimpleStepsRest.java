package com.mgs.restframework;

import com.mgs.restframework.context.Context;
import com.mgs.restframework.services.RestService;
//import com.mgs.restframework.steps.AbstractSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.То;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

/*
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:spring-config.xml")
@Component
*/
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/features")

/*
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
*/
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= AppConfiguration.class)
public class SimpleStepsRest  //extends CucumberStepDefinitions
{

    @Autowired
    public RestService restService;
/*
    @Autowired
    public RestService restService;

    @Autowired
    public ApplicationContext applicationContext;
*/


//    public ApplicationContext applicationContext;

    @Дано("^выполняем шаг R1$")
        public void doStep1(){
            System.out.println("step1");
        }

        @То("^выполняем шаг R2$")
        public void doStep2(){
            System.out.println("step2");
        }

    @Дано("^выполняем GET запрос по url \"([^\"]*)\"$")
    public void executeGetByUrl(String url) throws Throwable {
      //  applicationContext = Context.getInstance();
        restService.executeGetByUrl(url);;
    }

    @То("^код ответа 200-Ok$")
    public void responceCode200Ok() throws Throwable {
        boolean result = restService.isResponceCode200Ok();
        assertTrue("Ошибка. Получен другой код ответа", result);
    }
}
