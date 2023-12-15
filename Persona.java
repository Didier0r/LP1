public class Persona {
 private Scanner scanner; 
 private String nombre; 
 private int edad; 
 
 public void inicializar() {
    scanner = new Scanner(System.in); 
    System.out.print("Ingrese nombre");
    nombre = scanner.nextLine();
    System.outprint( "Digite edad"); 
    edad = scanner.nextInt(); 

 }
    public void imprimir() {
        System.out.println("Nombre ingresado = " + nombre );
        System.out.println("Edad digitado = " + edad );
    }
    public void buscarMayor() {
        if (edad >= 18) {
            System.out.println( nombre + " es mayor de edad"); 
        } else {
            System.out.println( nombre + " es menor de edad"); 

        }
    }
    public static void main(String[] args) {
        Persona persona = new Persona(); 
        persona.inicializar();
        persona.imprimir();
        persona.buscarMayor();
    }
    
}