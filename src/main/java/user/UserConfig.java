package user;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2022/8/29.
 *
 * @author 国洪志
 */
@Configurable
@ComponentScan // 注解@ComponentScan 不做任何配置,默认扫描当前包(user),以及当前包下的所有子包
//@ComponentScan(basePackages = "soundsystem") // 根据basePackages指定包名
//@ComponentScan(basePackages = {"soundsystem", "video"})// 根据basePackages指定多个包名
public class UserConfig {
}
