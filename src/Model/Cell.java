package Model;

import View.Point;

public class Cell {
private boolean isAlive;
private Point position;
    public Cell(int w, int h) {
        isAlive = true;
        position = new Point();
    }

}
