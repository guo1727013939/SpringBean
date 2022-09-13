package profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/9/13.
 *
 * @author 国洪志
 */
@Profile(value = "prod")
@Component
public class User3 implements MoveFactor {

    @Override
    public void eat() {
        System.out.println("吃面");
    }
}
