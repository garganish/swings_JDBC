
package Swings;

import java.awt.Color;


public enum Colours
{
    Red(Color.RED) , Blue(Color.BLUE),Green(Color.GREEN),Black(Color.black),Pink(Color.pink),Yellow(Color.yellow),Orange(Color.orange);
   private  Color colours;

    public Color getColours() {
        return colours;
    }

   
    private Colours(Color colours) {
        this.colours = colours;
    }

   

}
