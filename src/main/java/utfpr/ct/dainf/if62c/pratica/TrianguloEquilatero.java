package utfpr.ct.dainf.if62c.pratica;

public class TrianguloEquilatero extends Retangulo implements FiguraComLados{
    
    public TrianguloEquilatero(){};
    
    public TrianguloEquilatero(double lado){
        
        super(lado,(lado/2)*Math.sqrt(3));
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
      
        return super.getArea()/2;       
    }
    
    @Override
    public double getPerimetro(){
        
        return 3*getBase();
    }
}