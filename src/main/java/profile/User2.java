package profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/9/13.
 *
 * @author 国洪志
 */
@Profile(value = "qa")
@Component
public class User2 implements MoveFactor{
    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}
