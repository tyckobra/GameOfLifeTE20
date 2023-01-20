package Model;
import Model.Cell;
import View.*;
//import java.awt.*;
//import java.awt.Shape;
import java.util.ArrayList;

public class Model {

    int width;
    int height;
    Cell c;

    public Model(int w, int h) {
        this.width = w;
        this.height = h;
        this.c = new Cell(1,1);
    }

    public void update() {
        c.update();
    }

    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();

        if (c.isAlive()) {
            points.add(c.getPoint());
        }

        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);

        return pixelsToDisplay;
    }
}
