package primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author 国洪志
 * @description
 * @since 2022-09-14 15：24
 **/
@Component
//@Primary
public class Cake implements Dessert{
    @Override
    public void beEaten() {
        System.out.println("Cake被吃掉了");
    }
}
