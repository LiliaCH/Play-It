import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * muestra los créditos
 * 
 * @author (Lilia y Esaú) 
 * @version (11.04.2016)
 */
public class credits extends World
{

    /**
     * Constructor for objects of class credits.
     * 
     */
    public credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        main_menu main_menu = new main_menu();
        addObject(main_menu,32,385);
        main_menu.setLocation(23,383);
    }
}
