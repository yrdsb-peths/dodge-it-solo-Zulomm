import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit extends Actor
{
    /**
     * Act - do whatever the hit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-15);
        
        if(getX()<= 0)
        {
            resetHit();
        }
        if(isTouching(Me.class))
        {
            Dead dead = new Dead();
            getWorld().addObject(dead, 850, 500);
            getWorld().removeObject(this);
        }
    }
    
    public void resetHit()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(1500,200);
        }
        else
        {
            setLocation(1500,800);
        }
    }
}
