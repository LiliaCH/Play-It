import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pianistaa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pianistaa extends pianista
{
    /**
     * Act - do whatever the pianistaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pianistaa()
    {
    
        im1=new GreenfootImage("pianista1.png");
        im2=new GreenfootImage("pianista2.png");
        im3=new GreenfootImage("pianista3.png");
        im4=new GreenfootImage("pianista4.png");
       
        setImage(im1);
    }
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
