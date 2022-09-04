package person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created on 2022/9/3.
 *
 * @author 国洪志
 */
@Configurable
public class GameConfig {
    @Bean
    public Game game() {
        return new Lol();
    }

}
