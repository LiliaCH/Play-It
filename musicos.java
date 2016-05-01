import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musicos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musicos extends Actor
{
    /**
     * Act - do whatever the musicos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootImage im1,im2,im3,im4;
    private Integer mov=1;
    private Integer dir=1;
    public musicos()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
        if(dir==1)
        {
        switch(mov)
        {
        case 1:
            setImage(im2);
            mov++;
        break;
        case 2:
            setImage(im3);
            mov++;
        break;
        case 3:
            setImage(im4);
            mov++;
        break;
        case 4:
            dir=0;
        break;
        
        }
       }else{
        switch(mov)
        {
        case 1:
            dir=1;
        break;
        case 2:
            setImage(im1);
            mov--;
        break;
        case 3:
            setImage(im2);
            mov--;
        break;
        case 4:
            setImage(im3);
            mov--;
        break;
        
        }
            
    
        }    
    }
}
