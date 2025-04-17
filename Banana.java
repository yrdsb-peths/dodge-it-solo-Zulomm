import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    boolean top = true;
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            top = !top;
        }
        
        if(top) 
        {
            setLocation(100, 100);
        }
        else
        {
            setLocation(700, 100);
        }
    }
}
