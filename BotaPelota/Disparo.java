import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends unMan
{
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() 
    {
        // Add your action code here.
        this.setLocation(this.getX(), this.getY() - 5);
        if(this.getY() == 0)
        {
            World mundo = this.getWorld();
            mundo.removeObject(this);
        }
        else if(isTouching(Pelota.class))
        {
            removeTouching(Pelota.class);
        }
    }    
}
