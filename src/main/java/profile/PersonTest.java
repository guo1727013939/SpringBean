package profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2022/9/13.
 *
 * @author 国洪志
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/profile.xml"}) //来标注我们想要导入这个测试类的某些bean。 XML文件方式
//@ContextConfiguration(classes = Application.class)  // Java配置类方式
@ActiveProfiles(value = "qa") // 选择不同的profile 打印的不同
//@Profile注解 可以用在类或者方法之上
//例如：
/**
 * public class DataSourceConfig {
 *
 *   @Bean(destroyMethod = "shutdown")
 *   @Profile("dev")
 *   public DataSource embeddedDataSource() {
 *     return new EmbeddedDatabaseBuilder()
 *         .setType(EmbeddedDatabaseType.H2)
 *         .addScript("classpath:schema.sql")
 *         .addScript("classpath:test-data.sql")
 *         .build();
 *   }
 *
 *   @Bean
 *   @Profile("prod")
 *   public DataSource jndiDataSource() {
 *     JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
 *     jndiObjectFactoryBean.setJndiName("jdbc/myDS");
 *     jndiObjectFactoryBean.setResourceRef(true);
 *     jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
 *     return (DataSource) jndiObjectFactoryBean.getObject();
 *   }
 * }
 */
//在SpringBoot中可以使用spring.profiles.active来选择环境
// spring.profiles.active可以在yml文件中来选择环境
public class PersonTest {
    @Autowired
    Person person;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void beanList() {
        Arrays.asList(applicationContext.getBeanDefinitionNames());
    }


    //TODO 打印所有的bean 查看User2为什么会注册多次
    @Test
    public void testProfile(){
        person.eat();
    }
}
