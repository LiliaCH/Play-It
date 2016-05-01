import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el dueto
 * 
 * @author (Esaú y Lilia) 
 * @version (21.04.2016)
 */
public class esc_dueto extends World
{

    /**
     * Constructor para la clase dueto
     * 
     */
    public esc_dueto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Crea los objetos y botones necesarios 
     */
    private void prepare()
    {
        pianistaa pianistaa = new pianistaa();
        addObject(pianistaa,256,208);
        cellistab cellistab = new cellistab();
        addObject(cellistab,388,251);
        main_menu main_menu3 = new main_menu();
        addObject(main_menu3,43,383);
        main_menu3.setLocation(26,383);
    }
}
