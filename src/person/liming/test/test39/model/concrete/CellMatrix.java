package person.liming.test.test39.model.concrete;

import person.liming.test.test39.model.AbstractCell;
import person.liming.test.test39.model.AbstractCellMatrix;

import java.util.Arrays;
import java.util.Random;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 13:172019/9/24
 */
public class CellMatrix extends AbstractCellMatrix {


    public CellMatrix(int row, int col) {
        super(row, col);
    }

    @Override
    public void init() {
        cells = new AbstractCell[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                cells[i][j] = new Cell();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i > 1){
                    cells[i][j].setWest(cells[i-1][j]);
                    if(j > 1){
                        cells[i][j].setWestNorth(cells[i-1][j-1]);
                    }
                    if(j < col -1){
                        cells[i][j].setWestSouth(cells[i-1][j+1]);
                    }
                }
                if(i < row-1){
                    cells[i][j].setEast(cells[i+1][j]);
                    if(j > 1){
                        cells[i][j].setEastNorth(cells[i+1][j-1]);
                    }
                    if(j < col -1){
                        cells[i][j].setEastSouth(cells[i+1][j+1]);
                    }
                }
                if(j > 1){
                    cells[i][j].setNorth(cells[i][j-1]);
                }
                if(j < col-1){
                    cells[i][j].setSouth(cells[i][j+1]);
                }
            }
        }
    }

    public void randomStateAll(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(Math.random() > 0.5) {
                    cells[i][j].setState(AbstractCell.CellState.dead);
                }else{
                    cells[i][j].setState(AbstractCell.CellState.survival);
                }
            }
        }
    }

    @Override
    public void changeStateAll() {
        AbstractCell.CellState[][] states = new AbstractCell.CellState[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                states[i][j] = cells[i][j].preChangeState();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                cells[i][j].setState(states[i][j]);
            }
        }
    }

    @Override
    public void clearAll() {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                cells[i][j].setState(AbstractCell.CellState.dead);
            }
        }
    }

    @Override
    public String toString() {
        return "CellMatrix{" +
                "cells=" + Arrays.deepToString(cells) +
                '}';
    }
}
