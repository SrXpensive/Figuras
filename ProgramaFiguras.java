import java.util.ArrayList;

public class ProgramaFiguras {
    static ArrayList<iFigura2D> figuras = new ArrayList<>();
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(3);
        Rectangulo rect = new Rectangulo(2.5,7);
        Triangulo tri = new Triangulo(2.3,6.8);
        Circulo circ = new Circulo(3.4);
        figuras.add(cuad);
        figuras.add(rect);
        figuras.add(tri);
        figuras.add(circ);
        System.out.println("Mostrar información de todos los elementos del array");
        System.out.println("------------------------------------------------------");
        for(iFigura2D f:figuras){
            System.out.println(f);
        }
        System.out.println("------------------------------------------------------");
        cuad.escalar(3);
        rect.escalar(3);
        tri.escalar(3);
        circ.escalar(3);
        System.out.println("TRAS ESCALAR FIGURAS:");
        System.out.println("Mostrar información de una figura seleccionada (cuadrado en este caso)");
        System.out.println("------------------------------------------------------");
        System.out.println(cuad);
        System.out.println("Mostrar área de una figura seleccionada (triángulo en este caso)");
        System.out.println("------------------------------------------------------");
        System.out.println("Área del triángulo: "+tri.area());
        System.out.println("Mostrar perímetro de una figura seleccinada (círculo en este caso)");
        System.out.println("------------------------------------------------------");
        System.out.printf("Perímetro del círculo: %.2f",circ.perimetro());
        
    }
}
