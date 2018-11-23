
package geometria;

public class Cuadrado extends Poligono {
    int ancho;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public Cuadrado(){
        super((int)(Math.random()*400),(int)(Math.random()*400));
        ancho=1+(int)(Math.random()*500);
    }
    
    public Cuadrado(int x,int y){
        super(x,y);
        ancho = 25+(int)(Math.random()*100);
    }
    
    public void dibujar(){
        lienzo.setColor(getColor());
        lienzo.fillRect(x, y, ancho, ancho);
    }
}
