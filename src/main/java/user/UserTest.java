package user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created on 2022/8/29.
 *
 * @author 国洪志
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConfig.class)
public class UserTest {

    @Autowired
    private LOL lol;

    @Autowired
    private DNF dnf;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(lol);
        assertNotNull(dnf);
    }
}
