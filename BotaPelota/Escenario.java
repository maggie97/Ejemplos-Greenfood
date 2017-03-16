import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        //unMan man = new unMan(
        prepare();
    }

    @Override
    public void act()
    {
        if( Greenfoot.mouseClicked(this)){
            System.out.println("click  en el mundo");
            MouseInfo raton  = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + "y = " + raton.getY()); 
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        unMan unman = new unMan();
        addObject(unman,307,349);
        Pelota pelota = new Pelota();
        addObject(pelota,482,121);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,207,111);
    }
}
