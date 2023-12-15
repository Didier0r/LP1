public class Sueldo {
private Scanner scanner; 
private int[] sueldos; 
//constructor 
public sueldo(){
    scanner = new Scanner(Sysrem.in);
    sueldos = new int[S];
}
private void capturar(){
    for (int i = 0; i < 5; i++){
        System.out.print("Ingrese sueldo" + ( i +i ) + ":");
        sueldos[i] = scanner.nextInt(); 
    }
}
private void imprimir(){
    for (int i = 0; i < 5; i++){
        System.out.println("Sueldo ingresado en la posiscion" + ( i + i ) + ":" + sueldos[i]);
    }
}
public static void main(String[] args) {
    Sueldo sueldo = new Sueldo();
    sueldo.capturar();
    sueldo.imprimir();
}
    
}