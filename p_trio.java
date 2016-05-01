import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p_trio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p_trio extends botones_menu
{
    /**
     * Act - do whatever the p_trio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            transicion newWorld = new transicion(3);
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
