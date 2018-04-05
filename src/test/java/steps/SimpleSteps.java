package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.То;

public class SimpleSteps {
    @Дано("^выполняем шаг 1$")
    public void doStep1(){
        System.out.println("step1");
    }

    @То("^выполняем шаг 2$")
    public void doStep2(){
        System.out.println("step2");
    }
}
