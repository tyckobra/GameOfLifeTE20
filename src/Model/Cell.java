package Model;

import View.Point;

import java.awt.*;

public class Cell {
    private boolean isAlive;
    private Point position;

    public Cell(int w, int h) {
        isAlive = true;
        position = new Point(w,h);
    }

    public void update() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public Point getPoint() {
        return position;
    }
}
