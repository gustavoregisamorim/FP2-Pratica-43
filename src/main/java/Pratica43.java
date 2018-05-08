import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

public class Pratica43 {
    public static void main(String[] args) {
        
        Elipse elipse = new Elipse(5,5);
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(5,5);
        Retangulo retangulo = new Retangulo(5,5);
        Quadrado quadrado = new Quadrado(5);
        TrianguloEquilatero triangulo = new TrianguloEquilatero(5);       
        
        System.out.println(elipse.getArea());
        System.out.println(elipse.getPerimetro());
        System.out.println(circulo2.getArea());
        System.out.println(circulo1.getPerimetro());
        
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());        
    }
}