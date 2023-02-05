package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class HauntedHouse extends GraphicalObject {

    public HauntedHouse(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(49, 49, 49));
        drawTool.drawFilledRectangle(150, 130, 500, 300);
    }
}

