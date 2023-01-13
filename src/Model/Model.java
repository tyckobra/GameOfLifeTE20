package Model;
import Model.Cell;
import View.*;
import java.awt.*;
import java.awt.Shape;
import java.util.ArrayList;

public class Model {

    int width;
    int height;
    Cell = cell;

    public Model(int w, int h) {
        this.width = w;
        this.height = h;
        this.cell = new Cell(10,10);
    }

    public void update() {
        cell.update();
    }

    public Shape[] getShapes() {
        if (cell.isAlive()) {
            Shape[] points = new Shape[1];
            points[0] = cell.getPoint();
            return points;
        } else {
            return new Shape[0];
        }
    }
}
