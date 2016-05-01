import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ayuda extends World
{

    /**
     * Constructor for objects of class ayuda.
     * 
     */
    private GreenfootImage a1,aup,afin;
    private botones bmore, bplay;
    private Integer cont=1;
    public ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        a1 = new GreenfootImage("ayuda_carteles1.png");
        aup = new GreenfootImage("ayuda_cartelesuphere.png");
        afin = new GreenfootImage("ayuda_cartelesfin.png");
        bmore = new more_about();
        bplay=new play();
        setBackground(a1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        main_menu main_menu = new main_menu();
        addObject(main_menu,28,383);
   
        
        
    }
    public void act()
    {
        switch(cont)
        {
        case 1: if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(aup);
                    cont++;
                }
                
        break;
        case 2: if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(afin);
                    addObject(bmore, 200,300);
                    addObject(bplay, 400,300);
                    cont++;
                }
                else {if(Greenfoot.isKeyDown("left"))
                {
                cont--;
            }
        }
        
    }
    }
}

