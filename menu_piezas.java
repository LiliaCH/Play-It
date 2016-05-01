import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu_piezas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu_piezas extends World
{

    /**
     * Constructor for objects of class menu_piezas.
     * 
     */
    public menu_piezas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        /*Escenario n_w = new Escenario();
        Greenfoot.setWorld(n_w);*/
    }
    
    public void prepare()
    {

        p_dueto p_dueto = new p_dueto();
        addObject(p_dueto,123,208);
        p_trio p_trio = new p_trio();
        addObject(p_trio,304,198);
        p_cuarteto p_cuarteto = new p_cuarteto();
        addObject(p_cuarteto,494,196);

        p_dueto.setLocation(105,268);
        p_cuarteto.setLocation(482,264);
        p_trio.setLocation(294,266);
        choose choose = new choose();
        addObject(choose,310,87);
        choose.setLocation(303,71);
        choose.setLocation(298,71);
        main_menu main_menu = new main_menu();
        addObject(main_menu,31,390);
        main_menu.setLocation(27,384);
    }
}
