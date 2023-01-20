package Model;
import Model.Cell;
import View.*;
//import java.awt.*;
//import java.awt.Shape;
import java.util.ArrayList;

public class Model {

    int width;
    int height;

    Cell Cells;

    public Model(int w, int h) {
        this.width = w;
        this.height = h;
        this.Cells = new Cell(12,20);
    }

    public void update() {
        Cells.update();
    }

    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();

        if (Cells.isAlive()) {
            points.add(Cells.getPoint());
        }

        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);

        return pixelsToDisplay;
    }
}
