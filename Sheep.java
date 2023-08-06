import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Animals
{
    public Sheep()
    {
        super(5);
    }
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int movement = 4;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+movement);
        if (getY()==399)
        {
            movement = -4;
        }
        if (getY()==0)
        {
            movement = 4;
        }
    }
    
}
