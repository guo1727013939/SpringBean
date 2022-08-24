package soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * @author 国洪志
 * @description
 * @since 2022-08-22 09：58
 **/
@Component(value = "lonelyHeartsClub")
//@Named(value = "lonelyHeartsClub")//另一种命名方式：Java 依赖注入规范（Java Dependency Injection）中所提供的 @Named 注解来为 bean 设置 ID：
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist  = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
