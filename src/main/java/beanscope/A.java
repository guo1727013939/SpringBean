package beanscope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 国洪志
 * @description
 * @since 2022-09-14 17：04
 **/
@Component
public class A {

    @Autowired
    private B b;

}
