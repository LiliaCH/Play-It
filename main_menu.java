import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main_menu extends botones
{
    /**
     * Act - do whatever the main_menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if(Greenfoot.mouseClicked(this))
       {
        Menu newWorld = new Menu();
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
