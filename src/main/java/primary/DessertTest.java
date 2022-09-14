package primary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {


    private Dessert dessert;
    @Autowired
    //@Qualifier 如果默认不填参数，那个实现类添加了@Qualifier 就注入谁
    @Qualifier("iceCream")


    /**
     * 设置首选 bean 的局限性在于 @Primary 无法将可选方案的范围限定到唯一一个无歧义性的选项中。它只能标示一个优先的可选方案。当首选 bean
     * 的数量超过一个时，我们并没有其他的方法进一步缩小可选范围。
     * 与之相反，Spring 的限定符能够在所有可选的 bean 上进行缩小范围的操作，最终能够达到只有一个 bean 满足所规定的限制条件。如果将所有的限定符
     * 都用上后依然存在歧义性，那么你可以继续使用更多的限定符来缩小选择范围。
     *
     * @Qualifier 注解所设置的参数就是想要注入的 bean 的 ID。所有使用 @Component 注解声明的类都会创建为 bean，并且 bean 的 ID 为首字母变为小写的类名。
     */
    /*@Cold
    @Creamy*/
    /**
     * 或者使用自定义注解 通过在定义时添加 @Qualifier 注解，它们就具有了 @Qualifier 注解的特性。它们本身实际上就成为了限定符注解。
     */

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
    // @Primary 当 Spring 试图自动装配 setDessert() 中的 Dessert 参数时，它并没有唯一、无歧义的可选值。
    // 如果有多个实现并且未指定会报错：
    /**
     * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
     *   No qualifying bean of type [com.desserteater.Dessert] is defined:
     *     expected single matching bean but found 3: cake,cookies,iceCream
     */

    @Test
    public void dessertShouldNotBeNull(){
        dessert.beEaten();
        assertNotNull(dessert);
    }
}
