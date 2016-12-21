package aop.test.classes;

import org.springframework.stereotype.Component;

/**
 * Created by vlad on 21.12.2016.
 */
@Component
public class Entity {

    public void entityMethod() {
        System.out.println("ENTITY CALLED");
    }

    public static void main(String[] args) {
        new Entity().entityMethod();
    }

}
