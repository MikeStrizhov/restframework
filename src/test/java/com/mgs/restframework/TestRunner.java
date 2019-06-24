package com.mgs.restframework;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"steps", "hooks", "src/test/java/com/mgs/restframework"},
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE//,
//        name = "^Успешное|Успешная.*"
)
//@ContextConfiguration(classes= AppConfiguration.class)
public class TestRunner {

}

//import cucumber.api.CucumberOptions;

//import cucumber.api.SnippetType;
/*@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"steps", "hooks"},
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE//,
//        name = "^Успешное|Успешная.*"
)*/
//)
////        name = "^Успешное|Успешная.*"
//        snippets = SnippetType.UNDERSCORE//,
//        strict = false,
//        dryRun = false,
//        tags = "@all",
//        glue = {"steps", "hooks"},
//        features = "src/test/features",
//@CucumberOptions(
//@ContextConfiguration(locations="classpath:spring-config.xml")
////@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.ContextConfiguration;
//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;
