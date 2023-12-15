import java.util.Scanner;

public class Practica3ejercicio2 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        int tabla, result;
        //entrada
        System.out.print( "Que tabla desea mostrar?");
        tabla = scanner.nextInt();
        //bucle
        for (int i = 1; i < 11; i++ ) {
            result = tabla * i; 
            System.out.println( tabla + " x " + i + " = " + result); 

        }
        scanner.close();
    }
}
