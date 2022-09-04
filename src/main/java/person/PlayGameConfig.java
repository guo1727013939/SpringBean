package person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created on 2022/9/3.
 *
 * @author 国洪志
 */
@Configurable
@Import(UserConfig.class)
@ImportResource("classpath:person.xml")
public class PlayGameConfig {
}
