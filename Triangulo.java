public class Triangulo implements iFigura2D{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return Math.sqrt(Math.pow(getBase(),2)+Math.pow(getAltura(),2));
    }

    @Override
    public double area() {
        return (getBase()*getAltura()/2);
    }

    @Override
    public void escalar(double escala) {
        if (escala < 0){
            System.out.println("La escala debe ser mayor de cero");
        }else{
            this.base *= escala;
            this.altura *= escala;
        }
    }
    public String toString(){
        return "Triángulo de base "+getBase()+" y altura "+getAltura();
    }
}
