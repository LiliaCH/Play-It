import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class transicion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class transicion extends World
{

    /**
     * Constructor for objects of class transicion.
     * 
     */
    private GreenfootImage ima1,ima2,ima3,ima4,ima5,ima6;
    private Integer  x,o;
    
    
    public transicion(int op)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        o=op;
        x=3;
        ima1=new GreenfootImage("m4.png");
        ima2=new GreenfootImage("e2.png");
        ima3=new GreenfootImage("e3.png");
        ima4=new GreenfootImage("e4.png");
        ima5=new GreenfootImage("e5.png");
        ima6=new GreenfootImage("e6.png");

        
    }
    public void act()
    {
            setBackground(ima1);
            Greenfoot.delay(x);
            setBackground(ima2);
            Greenfoot.delay(x);
            setBackground(ima3);
            Greenfoot.delay(x);
            setBackground(ima4);
            Greenfoot.delay(x);
            setBackground(ima5);
            Greenfoot.delay(x);
            setBackground(ima6);
            Greenfoot.delay(x);
            switch(o)
            {
            case 1:
            menu_piezas newWorld = new menu_piezas();
            Greenfoot.setWorld(newWorld);
            break;
            case 2: esc_dueto newW = new esc_dueto();
            Greenfoot.setWorld(newW);
            break;
            case 3: esc_trio newoW = new esc_trio();
            Greenfoot.setWorld(newoW);
            break;
            case 4: esc_cuarteto newaW = new esc_cuarteto();
            Greenfoot.setWorld(newaW);
            break;
            }
            
    }
}
