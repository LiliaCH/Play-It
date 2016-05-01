import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cellistab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cellistab extends cellista
{
    /**
     * Act - do whatever the cellistab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cellistab()
    {
        im1=new GreenfootImage("cellista1b.png");
        im2=new GreenfootImage("cellista2b.png");
        im3=new GreenfootImage("cellista3b.png");
        im4=new GreenfootImage("cellista4b.png");
       
        setImage(im1);
    }
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
