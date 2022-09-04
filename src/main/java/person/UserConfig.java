package person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created on 2022/9/3.
 *
 * @author 国洪志
 */
@Configurable
@Import(GameConfig.class)
public class UserConfig {
    @Bean
    public User user(Game game) {
        return new User(game);
    }
}
