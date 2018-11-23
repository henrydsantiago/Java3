package geometria;

public class Circulo extends Figura{
    int radio;
    public float calcularArea()
    {
        return (float)Math.PI*radio*radio;
    }
    public void dibujar(){
        System.out.println("Dibujando un circulo...");
    }
    public String toString(){
        return super.toString()+" -> es un circulo";
    }
    public void imprimirInformacion(){
        
        System.out.println(" radio: "+radio);
        super.imprimirInformacion();
    }
    public Circulo(int r,int x,int y){
        // la primera instruccion debe ser el llamado
        // al constructor de la super clase
        super(x,y);
        radio = r;
    }
}
