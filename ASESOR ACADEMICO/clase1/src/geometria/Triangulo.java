
package geometria;

public class Triangulo extends Poligono{
    
    public Triangulo(int x,int y){
        super(x,y);
        System.out.println("constructor de triangulo");
    }
    public void dibujar(){
        System.out.println("dibujando un triangulo");
    }
}
