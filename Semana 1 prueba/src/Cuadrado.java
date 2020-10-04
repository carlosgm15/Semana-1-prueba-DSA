public class Cuadrado extends Rectangulo{

    private int r;

    public Cuadrado(int r){
        super(r,r);
    }

    @Override
    public String toString() {
        return "Cuadrado"+ super.getL1() +"area:(("+this.area()+"))";
    }
}
