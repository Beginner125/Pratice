package person.liming.test.test39.model;

import person.liming.test.test39.model.concrete.Cell;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 12:582019/9/24
 */
public abstract class AbstractCellMatrix {
    protected int row;
    protected int col;
    protected AbstractCell[][] cells;

    public AbstractCellMatrix(int row, int col) {
        this.row = row;
        this.col = col;
        init();
    }

    /**
     * 初始化所有cell的状态，关系
     */
    public abstract void init();

    /**
     * 一次性改变所有细胞状态
     */
    public abstract void changeStateAll();

    public void changeCell(int x, int y, AbstractCell cell){
        if ( (x>0 && x<row) && (y>0 && y<col) ){
            return;
        }
        cells[x][y] = cell;
    }
    /**
     * 清除所有细胞的状态
     */
    public abstract void clearAll();

    public AbstractCell[][] getCells() {
        return cells;
    }
}
