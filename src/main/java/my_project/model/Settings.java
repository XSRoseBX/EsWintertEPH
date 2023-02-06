package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import KAGO_framework.control.ViewController;
import KAGO_framework.control.*;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class Settings extends GraphicalObject implements Interactable{
    DrawTool copy;
    ViewController vc;
    public Settings(int x, int y, ViewController viewController) {
        this.setNewImage("src/main/resources/graphic/Zahnrad.png");
        this.x = x;
        this.y = y;
        this.vc = viewController;
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(getMyImage(), x, y);
        copy = drawTool;
    }

    public void update(double dt) {

    }
    public void getDragged() {
    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1){
            this.setNewImage("src/main/resources/graphic/bat-animation/bat-animation-1.png");
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
