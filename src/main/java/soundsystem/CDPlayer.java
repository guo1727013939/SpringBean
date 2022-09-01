package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/8/31.
 *
 * @author 国洪志
 */
@Component
public class CDPlayer implements MediaPlayer  {

    private CompactDisc cd;
    private SgtPeppers sgtPeppers;



    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired
    public CDPlayer(SgtPeppers sgtPeppers){
        this.sgtPeppers = sgtPeppers;
    }

    @Override
    public void play() {

    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
