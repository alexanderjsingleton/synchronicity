import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.WHITE);
        getBackground().fill();
        //setup28();
        //setup29();
        //setup29();
        //setup31();
        //setup32();
        //setup33();
        setup34();
    }
    public void setup34()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 18 )                   // test the value of i
        {
             addObject(new Bubble(190-i*10,i + i*20),getWidth()/2,getHeight()/2); 
            i = i + 1;                 // adjust the value of i
        }
    }
    public void setup33()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
            addObject(new Bubble(),45*i,30*i);
            i = i + 1;                 // adjust the value of i
        }
        int j = 0;   // declare and initialize the variable i
        while ( j < 10 )                   // test the value of i
        {
            addObject(new Bubble(),300 + j *40, 100);
            j = j + 1;                 // adjust the value of i
        }
    }

      public void setup32()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
            addObject(new Bubble(),45*i,30*i);
            i = i + 1;                 // adjust the value of i
        }
    }

      public void setup31()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
            addObject(new Bubble(),30*i,30*i);
            i = i + 1;                 // adjust the value of i
        }
    }
    
    public void setup30()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
            addObject(new Bubble(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            i = i + 1;                 // adjust the value of i
        }
    }

    public void setup29()
    {    
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
             addObject(new Bubble(),getWidth()/2,getHeight()/2); 
            i = i + 1;                 // adjust the value of i
        }
    }

    public void setup28()
    {
        addObject(new Bubble(),getWidth()/2,getHeight()/2);   // NOTE:  use getWidth()/2 and getHeight()/2 for the center
    }
}
