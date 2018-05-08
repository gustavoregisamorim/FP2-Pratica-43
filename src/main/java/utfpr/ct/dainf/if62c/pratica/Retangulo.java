package utfpr.ct.dainf.if62c.pratica;

public class Retangulo implements FiguraComLados{

    double base;
    private double altura;
    
    public Retangulo(){};
    public Retangulo(double base, double altura){
        
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double getLadoMenor() {
        
        double ladoMenor;
        
        if(base<altura)
            ladoMenor = base;
        else
            ladoMenor = altura;
        
        return ladoMenor;
    }

    @Override
    public double getLadoMaior() {
        
        double ladoMaior;
        
        if(base>altura)
            ladoMaior = base;
        else
            ladoMaior = altura;
        
        return ladoMaior;  
    } 
    
    public double getArea(){
      
        double area;
        
        area = base*altura;
        
        return area;       
    }
    
    public double getPerimetro(){
        
        double perimetro;
        
        perimetro = (base+altura)*2;
        
        return perimetro;
    }
    
    public double getBase(){
        
        return base;
    }
}