public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("|Implementación de TDA Pila - UDV|");
        System.out.println("----------------------------------");
        
        BitacoraStack pila = new BitacoraStack(5);
        pila.registrar("Motor de estribor encendido");
        pila.registrar("Velocidad warp alcanzada");
        pila.registrar("Señal de comunicación estable");
        pila.registrar("Anomalía detectada en sector 7");
        pila.registrar("Escudos al 40%");
        pila.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

        pila.consultarUltimo();

    }
}
