public class Banco {
    private Cliente cliente1, cliente2, cliente3;

    // Constructor
    public Banco() {
        cliente1 = new Cliente("Pablo");
        cliente2 = new Cliente("Julia");
        cliente3 = new Cliente("Sofia");
    }

    public void operar() {
        cliente1.depositar(50000);
        cliente2.depositar(150000);
        cliente3.depositar(250000);
        cliente3.extraer(100000);
    }

    public void mostrarTotalesClientes() {
        System.out.println("Total del cliente " + cliente1.getNombre() + ": " + cliente1.retornarMonto());
        System.out.println("Total del cliente " + cliente2.getNombre() + ": " + cliente2.retornarMonto());
        System.out.println("Total del cliente " + cliente3.getNombre() + ": " + cliente3.retornarMonto());
    }

    public void mostrarTotalBanco() {
        int total = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.println("Total del Banco: " + total);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.operar();
        banco.mostrarTotalesClientes();
    }
}
