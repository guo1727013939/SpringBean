package primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 国洪志
 * @description
 * @since 2022-09-14 15：25
 **/
@Component
@Qualifier
public class IceCream implements Dessert{
    @Override
    public void beEaten() {
        System.out.println("IceCream被吃掉了");
    }
}
