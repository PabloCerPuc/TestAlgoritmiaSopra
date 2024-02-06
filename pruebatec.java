//Esta solución corresponde al primer ejercicio de la prueba de algoritmia
import java.util.Scanner;

public class pruebatec
{
    public static void main(String[] args)
    {
       
        System.out.println("Introduce un numero");
        int numero = leernumero();       
        if(numero%2 == 0){
            for(int i=numero; i>=0; i--){
                System.out.println(i);
                i--;
            }
        } else{
            for(int i=numero; i>=1; i--){
                System.out.println(i);
                i--;
            }
        }
        
    }

    public static int leernumero()
    {
        Scanner scanner = new Scanner(System.in);
        String numeroEnString = scanner.nextLine();
        int numerodev = Integer.parseInt(numeroEnString);
        scanner.close();
        return numerodev;       
    }
}
