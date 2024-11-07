import processing.core.*;
public class Animation
{
    public Animation(PApplet p)
    {
        this.p = p;
        position = new PVector(300,300);
        velocity = new PVector(p.random(-5,5), p.random(-5,5));
        width = p.random(5,20);
        height = p.random(5,20);
        c = p.color(p.random(256), p.random(256), p.random(256));
    }
    public void display()
    {
        p.fill(c);
        p.rect(position.x, position.y, width, height);
        position.add(velocity);
        if (position.x < width || position.x > p.width - width)
            velocity.x *= -1;
        if (position.y < height || position.y > p.height - height)
            velocity.y *= -1;
    }
    
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float width;;
    private float height;
    private int c;
}