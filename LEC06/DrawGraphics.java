import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        Rectangle box = new Rectangle(15, 20, Color.RED);
        Line line = new Line(10, 10, Color.blue);
        movers = new ArrayList<>();
        movers.add(new Bouncer(100, 170, box));
        movers.get(0).setMovementVector(3, 1);
        movers.add(new Bouncer(150, 100, box));
        movers.get(1).setMovementVector(2, 1);
        movers.add(new Bouncer(50, 100, line));
        movers.get(2).setMovementVector(2, 0);
        movers.add(new StraightMover(120, 50, box));
        movers.get(3).setMovementVector(3, 2);
        movers.add(new StraightMover(140, 70, line));
        movers.get(4).setMovementVector(2, -4);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (int i=0; i<movers.size(); i++){
            movers.get(i).draw(surface);
        }
            
    }
}
