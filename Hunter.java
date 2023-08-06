import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delay = 40;
    public Hunter()
    {
        int newWidth = getImage().getWidth()/4;
        int newHeight = getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
       
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            
        }
        
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(getRotation()-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(getRotation()+4);
        }
        
        
        if(delay<=40)
        {
            fire();
        }
        delay--;

    }
        public void fire()
    {
        if(Greenfoot.isKeyDown("F"))
        {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet,getX(),getY());
            bullet.setRotation(getRotation());
            delay=80;
        }
    }
        
    }
    
    
    

