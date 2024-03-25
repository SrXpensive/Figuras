public class Circulo implements iFigura2D{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return Math.PI*2*getRadio();
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public void escalar(double escala) {
        if (escala < 0){
            System.out.println("La escala debe ser mayor de cero");
        }else{
            this.radio *= escala;
        }
    }
    public String toString(){
        return "Círculo de radio "+getRadio();
    }
}
