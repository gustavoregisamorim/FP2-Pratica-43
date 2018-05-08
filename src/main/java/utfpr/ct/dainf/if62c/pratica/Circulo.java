package utfpr.ct.dainf.if62c.pratica;

public class Circulo extends Elipse {
    
    private double raio;
    
    public Circulo(){
    }
    public Circulo(double raio){
        this.raio = raio;
    }
    public Circulo(double semieixo1,double semieixo2){
        super(semieixo1,semieixo2);
    }
    public Circulo(double semieixo1,double semieixo2,double raio){
        super(semieixo1,semieixo2);
        this.raio = raio;
    }
    @Override
    public double getPerimetro(){
        
        double perimetro;
        perimetro = 2 * Math.PI * this.raio;
        
        return perimetro;
    }
}