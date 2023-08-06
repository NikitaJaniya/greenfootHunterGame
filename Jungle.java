import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jungle extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Jungle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Hunter(),57,344);
        for (int i=1; i<=10 ; i++)
        {
           addObject(new Sheep(),468,344+(15*i)); 
        }
        
        for (int i=0; i<=10;i++)
        {
            int x = Greenfoot.getRandomNumber(590);
            int y = Greenfoot.getRandomNumber(217);
            addObject(new Duck(),x,y);
        }
        
    }
}
