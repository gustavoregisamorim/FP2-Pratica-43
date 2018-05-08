package utfpr.ct.dainf.if62c.pratica;

public class Quadrado extends Retangulo implements FiguraComLados{

    public Quadrado(){};
    
    public Quadrado (double lado){
    
        super(lado,lado);
    }
    
    @Override
    public double getLadoMenor() {
        
        return super.getLadoMenor();       
    }

    @Override
    public double getLadoMaior() {
        
        return super.getLadoMaior();       
    } 
    
    @Override
    public double getArea(){
     
        return super.getArea();       
    }
    
    @Override
    public double getPerimetro(){
        
        return super.getPerimetro();
    }
}