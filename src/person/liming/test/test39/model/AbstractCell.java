package person.liming.test.test39.model;

import person.liming.test.test39.model.concrete.Cell;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 12:512019/9/24
 */
public abstract class AbstractCell {
    protected CellState state = CellState.dead;
    protected AbstractCell north;
    protected AbstractCell south;
    protected AbstractCell east;
    protected AbstractCell west;

    protected AbstractCell eastNorth;
    protected AbstractCell eastSouth;
    protected AbstractCell westNorth;
    protected AbstractCell westSouth;

    /**
     * 根据周围细胞改变状态
     */
    public abstract CellState preChangeState();

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public AbstractCell getNorth() {
        return north;
    }

    public AbstractCell setNorth(AbstractCell north) {
        this.north = north;
        return this;
    }

    public AbstractCell getSouth() {
        return south;
    }

    public AbstractCell setSouth(AbstractCell south) {
        this.south = south;
        return this;
    }

    public AbstractCell getEast() {
        return east;
    }

    public AbstractCell setEast(AbstractCell east) {
        this.east = east;
        return this;
    }

    public AbstractCell getWest() {
        return west;
    }

    public AbstractCell setWest(AbstractCell west) {
        this.west = west;
        return this;
    }

    public AbstractCell getEastNorth() {
        return eastNorth;
    }

    public void setEastNorth(AbstractCell eastNorth) {
        this.eastNorth = eastNorth;
    }

    public AbstractCell getEastSouth() {
        return eastSouth;
    }

    public void setEastSouth(AbstractCell eastSouth) {
        this.eastSouth = eastSouth;
    }

    public AbstractCell getWestNorth() {
        return westNorth;
    }

    public void setWestNorth(AbstractCell westNorth) {
        this.westNorth = westNorth;
    }

    public AbstractCell getWestSouth() {
        return westSouth;
    }

    public void setWestSouth(AbstractCell westSouth) {
        this.westSouth = westSouth;
    }

    public enum CellState{
        dead, survival;
    }

    @Override
    public String toString() {
        return "AbstractCell{" +
                "state=" + state +
                '}';
    }
}
