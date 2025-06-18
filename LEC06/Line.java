import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Line implements Sprite {
    private int width;
    private int height;
    private Color color;

    public Line(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics surface, int x, int y) {
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawLine(x, y, x + width, y + height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
