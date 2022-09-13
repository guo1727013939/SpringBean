package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/9/13.
 *
 * @author 国洪志
 */
@Component
public class Person {
    @Autowired
    private MoveFactor moveFactor;

    public void eat(){
        moveFactor.eat();
    }

}
