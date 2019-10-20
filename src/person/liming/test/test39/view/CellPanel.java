package person.liming.test.test39.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 13:342019/9/24
 */
public class CellPanel extends JPanel {

    int row;
    int col;
    int rowRap;
    int colRap;
    Color[][] blocks;

    public CellPanel(int width, int height, int row, int col, Color[][] blocks) throws HeadlessException {
        setSize(width,height);
        this.row = row;
        this.col = col;
        this.rowRap = getWidth()/row;
        this.colRap = getHeight()/col;
        this.blocks = blocks;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                g.setColor(blocks[i][j]);
                g.fillRect(i*rowRap, j*colRap, rowRap, colRap);
            }
        }

        g.setColor(Color.GREEN);
        for(int i = 0; i< row; i++){
            g.drawLine(i*rowRap, 0, i*rowRap, getHeight());
        }
        for(int i = 0; i< col; i++){
            g.drawLine(0, i*colRap, getWidth(), i*colRap);
        }
    }

    public void setBlocks(Color[][] blocks) {
        this.blocks = blocks;
    }
}
