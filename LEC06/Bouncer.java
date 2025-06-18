import java.awt.Graphics;

public class Bouncer extends MovingSprite {
    public Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    @Override
    public void draw(Graphics surface) {
        super.draw(surface); // 先调用父类的绘制与移动

        // 然后处理边界反弹
        if ((x <= 0 && xDirection < 0) ||
            (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }

        if ((y <= 0 && yDirection < 0) ||
            (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }
}
