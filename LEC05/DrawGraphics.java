import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<>();
        boxes.add(new BouncingBox(100, 50, Color.RED));
        boxes.get(0).setMovementVector(1, 2);

        boxes.add(new BouncingBox(200, 100, Color.BLUE));
        boxes.get(1).setMovementVector(-2, 1);

        boxes.add(new BouncingBox(150, 200, Color.GREEN));
        boxes.get(2).setMovementVector(2, -1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawRect(10, 10, 50, 50);
        surface.drawOval(70, 10, 50, 50);
        surface.drawString("Hello!", 130, 40); // 文本

        // 🚀 画并移动多个方块
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
} 