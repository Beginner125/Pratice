package person.liming.test.test39;

import person.liming.test.test39.controller.CellController;
import person.liming.test.test39.model.AbstractCell;
import person.liming.test.test39.model.AbstractCellMatrix;
import person.liming.test.test39.model.concrete.Cell;
import person.liming.test.test39.model.concrete.CellMatrix;
import person.liming.test.test39.view.CellPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

/**
 * @author liuliming
 * @Description 写一个细胞自动机，使用MVC模式
 * @Date: Created in 12:462019/9/24
 */
public class Test39 {
    public static void main(String[] args) throws InterruptedException {
        CellController cellController = new CellController();
        cellController.init();
        cellController.begin();
    }

}
