import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esc_cuarteto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esc_cuarteto extends World
{

    /**
     * Constructor for objects of class esc_cuarteto.
     * 
     */
    public esc_cuarteto()
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
        violistaa violistaa = new violistaa();
        addObject(violistaa,329,228);
        violistaa.setLocation(303,221);
        violinistaa violinistaa = new violinistaa();
        addObject(violinistaa,235,250);
        violinistab violinistab = new violinistab();
        addObject(violinistab,158,274);
        violinistaa.setLocation(220,231);
        cellistab cellistab = new cellistab();
        addObject(cellistab,408,247);
        main_menu main_menu3 = new main_menu();
        addObject(main_menu3,36,387);
        main_menu3.setLocation(28,385);
    }
}
