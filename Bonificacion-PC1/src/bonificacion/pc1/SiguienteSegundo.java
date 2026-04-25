/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacion.pc1;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class SiguienteSegundo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int horas, minutos, segundos;
        
        System.out.print("Ingrese horas: ");
        horas = lector.nextInt();
        
        System.out.print("Ingrese minutos: ");
        minutos = lector.nextInt();
        
        System.out.print("Ingrese segundos: ");
        segundos = lector.nextInt();
        
        if (horas<0 || horas>23 || minutos<0 || minutos>59 || segundos<0 || segundos>59){
            System.out.println("Error: datos invalidos");
            return;
        }
        
        System.out.printf("Entrada: %02d:%02d:%02d\n", horas, minutos, segundos);
        
        segundos ++;
        
        if (segundos == 60){
            segundos = 0;
            minutos ++;
            
            if (minutos == 60){
                minutos = 0;
                horas ++;
                
                if (horas == 24){
                horas = 0;
                }
            }
        }
        
        System.out.printf("Salida: %02d:%02d:%02d\n", horas, minutos, segundos);
        
        lector.close();

    }

}
