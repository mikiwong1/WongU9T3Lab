import java.awt.Graphics;
public class Line extends Shape{

    public Line(){
        super();

    }

    @Override
    public void draw(Graphics g) {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y); // the getter methods here are INHERITED FROM SHAPE!
    }
}