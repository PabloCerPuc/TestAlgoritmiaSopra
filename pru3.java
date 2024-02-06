//Esta solución corresponde al tercer ejercicio de la prueba de algoritmia
import java.util.Scanner;

public class pru3
{
       public static double leerhoras(){
        Scanner scanner = new Scanner(System.in);
        String horasEnString = scanner.nextLine();
        double horasdev = Double.parseDouble(horasEnString);
        return horasdev;        
    }

    public static double leertarifa(){
        Scanner scanner = new Scanner(System.in);
        String tarifaEnString = scanner.nextLine();
        double tarifadev = Double.parseDouble(tarifaEnString);
        return tarifadev;
    }
    
    public static void main(String[] args) {
        System.out.println("Introduce numero de horas");
        double horastrabajadas = leerhoras();
        System.out.println("Introduce tarifa");
        double tarifa = leertarifa();
        
        double precioext = 0;
        double horaext = 0;
        double tarifaext = 0;
        if (horastrabajadas > 40){
            horaext = horastrabajadas - 40;
            tarifaext = tarifa + (tarifa/2);
            precioext = horaext * tarifaext;
        }
        double sueldo = (horastrabajadas * tarifa) + precioext;
        
        System.out.println("El sueldo del trabajador es de " + sueldo + "€");
    }

}
