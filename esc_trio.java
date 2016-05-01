import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que maneja la parte del trío
 * 
 * @author Lilia y Esaú 
 * @version (11.04.2016)
 */
public class esc_trio extends World
{

    /**
     * Constructor para los objetos, llama a la función prepare
     * 
     */
    public esc_trio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepara el mundo
     * Crea el pianista, violinista y cellista y los posiciona
     */
    private void prepare()
    {
        pianistaa pianistaa2 = new pianistaa();
        addObject(pianistaa2,356,212);
        violinistaa violinistaa = new violinistaa();
        addObject(violinistaa,181,277);
        cellistab cellistab2 = new cellistab();
        addObject(cellistab2,407,273);

        main_menu main_menu2 = new main_menu();
        addObject(main_menu2,34,392);
        main_menu2.setLocation(26,385);
    }
}
