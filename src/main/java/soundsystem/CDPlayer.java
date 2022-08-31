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



    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }


    @Override
    public void play() {

    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
