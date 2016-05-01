import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends botones
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public play()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
       
        if(Greenfoot.mouseClicked(this))
        {
            transicion newWorld = new transicion(1);
          
            Greenfoot.setWorld(newWorld);
        }
        
        
    }    
}
