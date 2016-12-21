package aop.test.classes;

import org.springframework.stereotype.Service;

/**
 * Created by vlad on 21.12.2016.
 */
@Service
public class SomeService {

    public void serviceMethod() {
        System.out.println("HELLO FROM SERVICE");
    }

}
