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
        for (int neighbours = Cell) {
            if (neighbours= 0<1) {
                !isAlive;
            }
            if (neighbours = 2) {
                return;
            }
            if (neighbours = 3) {
                isAlive;
            }
            if (neighbours = 4<8 ){
                !isAlive
            }
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Point getPoint() {
        return position;
    }
}
