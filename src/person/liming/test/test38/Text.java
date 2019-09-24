package person.liming.test.test38;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 21:562019/9/12
 */
public class Text extends Observable {
    private String str;//ÎÄ±¾×Ö·û

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }

    public Text(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
