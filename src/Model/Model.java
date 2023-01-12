package Model;
import View.*;
import java.awt.*;
import java.util.ArrayList;

public class Model {

    int width;
    int height;

    public Model(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void update() {
        return;
    }

    public Point[] getPoints() {
        ArrayList<Point> points = new ArrayList<Point>();
        for (Cell c : cells) {
            if (c.isAlive()) {
                points.add(c.getPoint());
            }
        }
    }

    public Shape[] getShapes() {
            return (Shape[])pixelsToDisplay;
    }
}
