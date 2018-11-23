package clase1;

import geometria.Circulo;
import geometria.Cuadrado;
import geometria.Figura;
import geometria.Triangulo;
import java.util.ArrayList;

public class Clase1 {

    public static void main(String[] args) {
        //Figura f=new Figura(15,20);
        //f.imprimirInformacion();
        Triangulo t=new Triangulo(5,5);
        
        Circulo c=new Circulo(50,25,60);
        c.imprimirInformacion();
        System.out.println(c.toString());
        //System.out.println(f);
        
        ArrayList<Figura> f=new ArrayList();
        f.add(new Circulo(0,0,0));
        f.add(new Cuadrado(0,0));
        f.add(new Triangulo(0,0));
        f.add(new Cuadrado(0,0));
        f.add(new Circulo(0,0,0));
        
        for (int i=0;i<f.size();i++){
            System.out.println("Figura "+i);
            Figura x=f.get(i);
            if (x instanceof Circulo)
            {
                Circulo y=(Circulo) x;
                y.calcularArea();
            }           
            x.dibujar();
            x.imprimirInformacion();
            System.out.println(x.getClass().getName());
            System.out.println("===============");
        }
    }
}
