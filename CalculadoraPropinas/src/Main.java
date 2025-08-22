import java.util.Scanner;

/*
    Escribe un programa que pida al usuario el total de la cuenta en un  restaurante y el procentaje de propina
    que desa dejar. El programa debe calcular y mostrar:
    - El monto de la propina
    - El total a pagar (cuenta + propina)
    Considera manejar el caso en que el usuario introduzaca un porcentaje de propina válido (por ejemplo un número
    negativo)
*/
public class Main {
    private static double totalCuenta;
    private static double porcentajePropina;

    private static Scanner src = new Scanner(System.in);

    public static void obtenerInformación(){
        System.out.println("Por favor ingrese el valor de la cuenta: " + "$ ");
        totalCuenta = src.nextDouble();

        System.out.println("¿Cuál es el porcentaje de propina asignada? "+ "% ");
        porcentajePropina = src.nextDouble();
    }

    public static double calcularPropina(){
        if (porcentajePropina < 0){
            System.out.println("Por favor ingrese una propina válida.");
            return 0.0;
        }

        double calculoPorcentaje = porcentajePropina / 100.0;
        double propina = totalCuenta * calculoPorcentaje;
        return  propina;
    }

    public static double cuentaFinal(double propina){
        return  totalCuenta + propina;
    }

    public static void main(String[] args) {
        obtenerInformación();

        double propinaCalculada = calcularPropina();
        double totalFinal = cuentaFinal(propinaCalculada);

        System.out.println("\n--- Resumen del Cálculo ---");
        System.out.println("El total de la cuenta es: $" + totalCuenta + " MXN");
        System.out.println("El porcentaje de propina asignada es : " + porcentajePropina + " %");
        System.out.println("El monto de la propina es: $" + propinaCalculada + " MXN");
        System.out.println("El total a pagar es: $" + totalFinal + " MXN");

        src.close();
    }

}