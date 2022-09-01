package soundsystem;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 国洪志
 * @description
 * @since 2022-08-22 10：49
 **/

@Configurable
public class CdPlayerConfig {

    /**
     *  @Bean 注解会告诉Spring这个方法将会返回一个对象，对该对象要注册为Spring应用上下文的Bean。
     * 默认情况下，bean的ID与带有@Bean注解的方法名是一样的。 可以使用@Bean的name属性进行重命名
     */

    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int)Math.floor(Math.random() * 4);
        if (choice == 0){
            return new SgtPeppers();
        }else if (choice == 1){
            return new SgtPeppers();
        }else if (choice == 2){
            return new SgtPeppers();
        }else{
            return new SgtPeppers();
        }
    }


    /**
     *  默认情况下Spring中的Bean都是单例的，我们并没有必要创建相同的Bean
     *
     *  我们这使用CDPlayer的构造器实现了DI功能，但是我们完全可以采用其他风格的DI配置
     *
     *  带有@Bean注解的方法可以采用任何必要的方式来产生bean实例
     *
     */
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    /*@Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }*/
}
