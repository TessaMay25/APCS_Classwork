import processing.core.*; 

public class Rectangle 
{
    public Rectangle(PApplet p)
    {
        this.p = p;
        position = new PVector(100,100);
        velocity = new PVector(p.random(-3,3), p.random(-3,3));
        base = p.random(5,10);
        height = p.random(5,10);
        c = p.color(p.random(256), p.random(256), p.random(256));

    }
    public void display()
    {
        p.fill(c);
        p.rect(position.x, position.y, base, height);
        position.add(velocity);
        if (position.x < base || position.x > p.width - base)
            velocity.x *= -1;
        if (position.y < height || position.y > p.height - height)
            velocity.y *= -1;
        
    }
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float base;
    private float height;
    private int c;
}