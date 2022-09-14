package conditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import org.springframework.context.annotation.Condition;

/**
 * Created on 2022/9/13.
 *
 * @author 国洪志
 */
//实现了Condition接口 该接口为函数式如果返回的是true MagicBean就会创建bean 否则就不会
public class MagicExistsCondition implements Condition{

    @Override
    public boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata) {
        Environment env = ctxt.getEnvironment();
        return env.containsProperty("magic");

        /**
         * 通过 ConditionContext，我们可以做到如下几点：
         * 借助 getRegistry() 返回的 BeanDefinitionRegistry 检查 bean 定义；
         * 借助 getBeanFactory() 返回的 ConfigurableListableBeanFactory 检查 bean 是否存在，甚至探查 bean 的属性；
         * 借助 getEnvironment() 返回的 Environment 检查环境变量是否存在以及它的值是什么；
         * 读取并探查 getResourceLoader() 返回的 ResourceLoader 所加载的资源；
         * 借助 getClassLoader() 返回的 ClassLoader 加载并检查类是否存在。
         */
        //metadata.isAnnotated();
        /**
         * AnnotatedTypeMetadata 则能够让我们检查带有 @Bean 注解的方法上还有什么其他的注解。像 ConditionContext 一样
         * ，AnnotatedTypeMetadata 也是一个接口。
         *
         * 借助 isAnnotated() 方法，我们能够判断带有 @Bean 注解的方法是不是还有其他特定的注解。借助其他的那些方法，
         * 我们能够检查 @Bean 注解的方法上其他注解的属性。
         */

        // @Profile 注解就是使用的@Conditional注解
        /**
         * class ProfileCondition implements Condition {
         *
         *        @Override
         *    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
         * 		MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
         * 		if (attrs != null) {
         * 			for (Object value : attrs.get("value")) {
         * 				if (context.getEnvironment().acceptsProfiles(Profiles.of((String[]) value))) {
         * 					return true;
         *                }
         *            }
         * 			return false;
         *        }
         * 		return true;
         *    }
         *
         * }
         */

    }
}
