package primary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CdPlayerConfig;
import soundsystem.CompactDisc;

import static org.junit.Assert.assertNotNull;

/**
 * @author 国洪志
 * @description
 * @since 2022-08-22 10：51
 **/
@Configurable
@ComponentScan
public class DessertConfig {

}
