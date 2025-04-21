import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Me here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Me extends Actor
{
    /**
     * Act - do whatever the Me wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean top = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            top = !top;
        }
        
        if(top)
        {
            setLocation(200,800);
        }
        else
        {
            setLocation(200,200);
        }
    }
}
