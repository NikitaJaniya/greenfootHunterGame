import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animals extends Actor
{
    public Animals(int divisionSize)
    {
        int newWidth = getImage().getWidth()/divisionSize;
        int newHeight = getImage().getHeight()/divisionSize;
        getImage().scale(newWidth,newHeight);
    }
    /**
     * Act - do whatever the Animals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
