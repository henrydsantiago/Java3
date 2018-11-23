package geometria;

public class Circulo extends Figura{
    int radio;
  
    public float calcularArea()
    {
        return (float)Math.PI*radio*radio;
    }
    @Override
    public void dibujar(){
        lienzo.setColor(getColor());
        lienzo.fillOval(x, y, radio, radio);
    }
    public String toString(){
        return super.toString()+" -> es un circulo";
    }
    public void imprimirInformacion(){
        
        System.out.println(" radio: "+radio);
        super.imprimirInformacion();
    }
   
    public Circulo(){
        super((int)(Math.random()*400),(int)(Math.random()*400));
        radio=1+(int)(Math.random()*500);
    }
    public Circulo(int r,int x,int y){
        // la primera instruccion debe ser el llamado
        // al constructor de la super clase
        super(x,y);
        radio = r;
    }
}
