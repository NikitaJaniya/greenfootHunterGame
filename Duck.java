import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class duck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck extends Animals
{
    public Duck()
    {
        super(4);
    }
    /**
     * Act - do whatever the duck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveDuck();
        disappearBullet();
    }
    
    public void moveDuck()
    {
         move(4);
        
        if (getX() == 599)
        {
            setLocation(0,getY());
        }
    }
    public void disappearBullet()
    {
        if(isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
        }
    }
}
