//Esta solución corresponde al segundo ejercicio de la prueba de algoritmia

import java.util.ArrayList;
import java.util.Random;

public class pru2
{
    
    public static class Persona{
        String sexo;
        int edad;
        public Persona(String sexo,int edad){
            this.sexo = sexo;
            this.edad = edad;
        }
    }
    
    public static ArrayList<Persona> leerpersonas(){
        ArrayList<Persona> arraypersonas = new ArrayList<>();
        Random rand = new Random();
        String[] sexos = {"M", "F"};
        for(int i = 0; i< 50; i++){
            int edadaleatoria = rand.nextInt(100) + 1;
            String sexoaleatorio = sexos[rand.nextInt(sexos.length)];
            Persona pers = new Persona(sexoaleatorio,edadaleatoria);
            arraypersonas.add(pers);
        }
        
        return arraypersonas;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Persona> personas = leerpersonas();
        int personastotales = personas.size();
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int mujeresTotales = 0;
        for(int i = 0; i<personas.size(); i++){
            Persona personaAnalizar = personas.get(i);
            if(personaAnalizar.edad > 18){
                mayoresDeEdad++;
                if(personaAnalizar.sexo == "M"){hombresMayores++;}
            }
            else{
                menoresDeEdad++;
                if(personaAnalizar.sexo == "F"){mujeresMenores++;}
            }
            if(personaAnalizar.sexo == "F"){mujeresTotales++;}
        }
        
        double porcentajeUno = ((double)mayoresDeEdad/personastotales)*100;
        double porcentajeDos = ((double)mujeresTotales/personastotales)*100;
        
        System.out.println("Hay " + mayoresDeEdad + " personas mayores de edad");
        System.out.println("Hay " + menoresDeEdad + " personas menores de edad");
        System.out.println("Hay " + hombresMayores + " hombres mayores de edad");
        System.out.println("Hay " + mujeresMenores + " mujeres menores de edad");
        System.out.println("Las personas mayores representan un " + porcentajeUno + "% respecto al total de personas");
        System.out.println("Las mujeres representan un " + porcentajeDos + "% respecto al total de personas");
    }
}
