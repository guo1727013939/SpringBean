package user;

import org.springframework.stereotype.Component;

/**
 * Created on 2022/8/29.
 *
 * @author 国洪志
 */
@Component
public class DNF implements Game {
    @Override
    public void play() {
        System.out.println("DNF");
    }
}
