import java.awt.Graphics;

public abstract class MovingSprite implements Mover {
    protected int x, y;
    protected int xDirection, yDirection;
    protected Sprite sprite;

    public MovingSprite(int startX, int startY, Sprite sprite) {
        this.x = startX;
        this.y = startY;
        this.sprite = sprite;
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        this.xDirection = xIncrement;
        this.yDirection = yIncrement;
    }

    public void move() {
        x += xDirection;
        y += yDirection;
    }

    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);
        move(); // 统一调用 move 逻辑
    }
}
