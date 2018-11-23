
package geometria;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura implements 
        IDibujable,
        Cloneable{
    int x;
    int y;
    protected Graphics lienzo;
    Color colores[]={Color.WHITE,Color.RED,Color.BLUE,
                     Color.BLACK,Color.YELLOW,Color.GREEN   };
    int color;
    
    Color getColor(){
        return colores[color];
    }
    
    public void setLienzo(Graphics lienzo){
        this.lienzo = lienzo;
    }
    
   // abstract public void dibujar();
    
    public String toString(){
        return " es una figura ";
    }
    public Figura(int x,int y){
        this.x=x;
        this.y=y;
        // numero aleatorio entre 0 y la cantidad de colores
        this.color = (int)(Math.random()*colores.length);
        System.out.println("constructor de Figura");
    }
    public void imprimirInformacion(){
        System.out.println("(X: "+x+", Y: "+y+" )");
    }
}
