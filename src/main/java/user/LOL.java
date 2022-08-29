package user;

import javax.inject.Named;

/**
 * Created on 2022/8/29.
 *
 * @author 国洪志
 */
@Named
public class LOL implements Game {
    @Override
    public void play() {
        System.out.println("LOL");
    }
}
