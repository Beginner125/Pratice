package person.liming.test.test38;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuliming
 * @Description 使用jdk建立观察者模式
 * @Date: Created in 22:122019/9/12
 */
public class Test38 {
    public static void main(String[] args) {
        Text text = new Text("美国发生的新闻");
        Board board = new Board("显示屏");
        Board board1 = new Board("新闻报纸");

        text.addObserver(board);
        text.addObserver(board1);
        text.notifyObservers();

        text.setStr("中国最近的新闻");
        text.notifyObservers();
    }
}
