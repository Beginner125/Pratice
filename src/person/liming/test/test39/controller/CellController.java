package person.liming.test.test39.controller;

import person.liming.test.test39.model.AbstractCell;
import person.liming.test.test39.model.AbstractCellMatrix;
import person.liming.test.test39.model.concrete.Cell;
import person.liming.test.test39.model.concrete.CellMatrix;
import person.liming.test.test39.view.CellPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 14:402019/9/24
 */
public class CellController {
    JFrame cellFrame;
    CellPanel cellPanel;
    AbstractCellMatrix cellMatrix;
    final int row = 683;
    final int col = 384;
    final int width = 1366;
    final int heght = 768;
    Color[][] blocks = new Color[row][col];
    private Color colorDead = randomColor();
    private Color colorSurvival = randomColor();
    ExecutorService executorService = Executors.newFixedThreadPool(2);


    public void init(){
        cellMatrix = new CellMatrix(row, col);

        ((CellMatrix)cellMatrix).randomStateAll();
        System.out.println(cellMatrix.toString());;

        cellFrame = new JFrame();
        cellFrame.setSize(width, heght);

        blocks = adaptCells(cellMatrix.getCells());

        cellPanel = new CellPanel(width, heght, row,col, blocks);
        cellFrame.add(cellPanel, BorderLayout.CENTER);
        cellFrame.setVisible(true);
    }

    public void begin() throws InterruptedException {

        while (true){
            cellMatrix.changeStateAll();
            System.out.println(cellMatrix.toString());
            blocks = adaptCells(cellMatrix.getCells());
            Thread.sleep(300);
            cellPanel.setBlocks(blocks);
            cellPanel.repaint();
        }
    }

    private Color randomColor(){
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(255);
        int j = random.nextInt(255);
        int k = random.nextInt(255);
        return Color.getHSBColor(i, j, k);
    }

    private Color[][] adaptCells(AbstractCell[][] cells){
//        colorDead = randomColor();
//        colorSurvival = randomColor();
        int row = cells.length;
        int col = cells[0].length;
        Color[][] colors = new Color[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(cells[i][j].getState() == AbstractCell.CellState.dead){
                    colors[i][j] = colorDead;
                }else {
                    colors[i][j] = colorSurvival;
                }
            }
        }
        return colors;
    }
}
