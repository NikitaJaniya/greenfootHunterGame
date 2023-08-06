import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bullet extends Actor
{
    public static int score;
    public Bullet()
    {
        int newWidth = getImage().getWidth()/14;
        int newHeight = getImage().getHeight()/14;
        getImage().scale(newWidth,newHeight);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        disappearDuck();
        disappearSheep();
        disappear();
    }
    public void disappear()
    {
        if(isAtEdge() || isTouching(Duck.class) || isTouching(Sheep.class))
        {
            getWorld().removeObject(this);
        }
    }
    public void disappearDuck()
    {
        if(isTouching(Duck.class))
        {
            removeTouching(Duck.class);
            score++;
            getWorld().showText("Score: "+score,40,25);
        }
    }
    public void disappearSheep()
    {
        if(isTouching(Sheep.class))
        {
            removeTouching(Sheep.class);
        }
    }
}
