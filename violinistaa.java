import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class violinistaa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class violinistaa extends violinista
{
    /**
     * Act - do whatever the violinistaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public violinistaa()
    {
        im1=new GreenfootImage("violinista1.png");
        im2=new GreenfootImage("violinista2.png");
        im3=new GreenfootImage("violinista3.png");
        im4=new GreenfootImage("violinista4.png");
       
        setImage(im1);
    }
    public void act() 
    {
        // Add your action code here.
         super.act();
    }    
}
