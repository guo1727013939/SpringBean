package primary;

import org.springframework.stereotype.Component;

/**
 * @author 国洪志
 * @description
 * @since 2022-09-14 15：24
 **/
@Component
public class Cookies implements Dessert{
    @Override
    public void beEaten() {
        System.out.println("Cookies被吃掉了");
    }
}
