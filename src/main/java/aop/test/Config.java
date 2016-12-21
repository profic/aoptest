package aop.test;

import aop.test.classes.Entity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vlad on 21.12.2016.
 */
public class Config {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println(c);

        new Entity().entityMethod();
//        c.getBean(Entity.class).entityMethod();
    }
}
