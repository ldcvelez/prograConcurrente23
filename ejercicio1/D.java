package ejercicio1;

public class D {
    public static void main(String[] args) {
        String letra = "D";
        String padrePID = args[0];

        System.out.println(letra + " (PID: " + ProcessHandle.current().pid() + ", PID Padre: " + ProcessHandle.current().parent().get().pid() + ")");

    }
}