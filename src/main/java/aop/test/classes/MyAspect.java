package aop.test.classes;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;


/**
 * Created by vlad on 21.12.2016.
 */
@Aspect
@Configurable
public class MyAspect {

    @Autowired
    private SomeService service;

    // todo: обязательно ставить ПРОБЕЛ после первой звездочки
    @Before("execution(* aop.test.classes..*.entityMethod(..))") // первая звездочка: неважно что метод возвращает
    // две точки: неважно какой дальше package,
    // звездочка: неважно какой класс
    // метод должен называться foo
    // неважно какие у метода параметры
    public void beforeFooMethods() {
        service.serviceMethod();
        System.out.println("aop foooooooooo invoked!!");
    }

}
