public class Rectangulo implements iFigura2D{
    private double lado1;
    private double lado2;
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro() {
        return (getLado1()*2)+(getLado2()*2);
    }

    @Override
    public double area() {
        return getLado1()*getLado2();
    }

    @Override
    public void escalar(double escala) {
        if (escala < 0){
            System.out.println("La escala debe ser mayor de cero");
        }else{
            this.lado1 *= escala;
            this.lado2 *= escala;
        }
    }
    public String toString(){
        return "Rectángulo con lados de tamaño "+getLado1()+" y "+getLado2();
    }
}
