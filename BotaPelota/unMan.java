import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class unMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unMan extends Actor
{
    //public unMan
    private boolean disparando;
    public unMan()
    {
        disparando = false;
    }
    @Override
    public void act() 
    {
        int speed = 3; 
        World mundo = this.getWorld();
        if(Greenfoot.isKeyDown("right")){
            //muevete a la derecha 
            this.setLocation(this.getX() + speed , this.getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            //muevete a la derecha 
            this.setLocation(this.getX() - speed , this.getY());
        }
        else if(Greenfoot.isKeyDown("up")){
            //muevete a la derecha -
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if(Greenfoot.isKeyDown("down")){
            //muevete a la derecha 
            this.setLocation(this.getX(), this.getY() + speed );
        }
        if(Greenfoot.isKeyDown("space") && !disparando){
            Disparo disp = new Disparo();
            mundo.addObject(disp, this.getX(),this.getY());
            disparando = true;
            
        }
        List lista = mundo.getObjects (Disparo.class);
        if(lista.isEmpty())
        {
            disparando  = false;
        }
    }
    
}
