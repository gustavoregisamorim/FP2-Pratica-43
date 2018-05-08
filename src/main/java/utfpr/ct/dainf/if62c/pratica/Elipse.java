package utfpr.ct.dainf.if62c.pratica;

public class Elipse implements FiguraComEixos {
    
    private double semieixo1;
    private double semieixo2;
    private String nome = "Elipse";
    
    public Elipse(){
        
    }
    public Elipse(double semieixo1,double semieixo2){
        this.semieixo1 = semieixo1;
        this.semieixo2 = semieixo2;
    }
    
    @Override
    public double  getArea(){
        double area;
        area = Math.PI * this.semieixo1 * this.semieixo2;
        return area;
    }
    
    @Override
    public double getPerimetro(){
        double perimetro;
        perimetro = Math.PI * (3 * (this.semieixo1 + this.semieixo2) - Math.sqrt(((3 * this.semieixo1) + this.semieixo2) * (this.semieixo1 + (3 * this.semieixo2))));
        return perimetro;
    }

    @Override
    public double getEixoMenor() {
   
        return this.semieixo1;
    }

    @Override
    public double getEixoMaior() {
     
        return this.semieixo2;   
    }

    @Override
    public String getNome() {
        return this.nome;
        
    }
}