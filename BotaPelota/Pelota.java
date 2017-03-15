import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incX;
    private int incY;
    public Pelota()
    {
        incX = 10;
        incY = 10;
    }
    
    @Override
    public void act() 
    {
        //Consulta cordenadas actuales heredadas de Actor 
        int posX = this.getX();
        int posY = this.getY();
        
        int nuevoX = posX + incX;
        int nuevoY = posY + incY;
        //accedemos al mundo para conocer su tamaño 
        World mundo = this.getWorld();
        if( nuevoX > mundo.getWidth()){
            incX = -incX;
        }
        else if( nuevoY > mundo.getHeight()){
            incY = -incY;
        }
        else if(nuevoY < 0 ) {
            incY = -incY;
        }
        else if(nuevoX < 0){
            incX = -incX;
        }
        this.setLocation(nuevoX, nuevoY);
    }    
}
