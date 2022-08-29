package soundsystem;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 国洪志
 * @description
 * @since 2022-08-22 10：49
 **/
@Configurable
@ComponentScan("soundsystem") //value属性指定包名
//@ComponentScan(basePackages = "soundsystem") // 根据basePackages指定包名
//@ComponentScan(basePackages = {"soundsystem", "video"})// 根据basePackages指定多个包名
public class CdPlayerConfig {
}
