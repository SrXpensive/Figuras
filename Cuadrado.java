public class Cuadrado implements iFigura2D{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return getLado()*getLado();
    }

    @Override
    public double perimetro() {
        return getLado()*4;
    }

    @Override
    public void escalar(double escala){
        if (escala < 0){
            System.out.println("La escala debe ser mayor de cero");
        }else{
            this.lado *= escala;
        }
    }
    public String toString(){
        return "Cuadrado de lado "+getLado();
    }

}
