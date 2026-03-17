public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("|Implementación de TDA Pila - UDV|");
        System.out.println("----------------------------------");
        System.out.println("Generando eventos...");

        BitacoraStack pila = new BitacoraStack(6);
        pila.registrar("Motor de estribor encendido");
        pila.registrar("Velocidad warp alcanzada");
        pila.registrar("Señal de comunicación estable");
        pila.registrar("Anomalía detectada en sector 7");
        pila.registrar("Escudos al 40%");
        pila.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

        if(pila.tamano() == pila.totalEventos()){
            if(pila.consultarUltimo().equals("ERROR")){}
            System.out.println("Evento actual: " + pila.consultarUltimo());
            System.out.println("**********************************");
            System.out.println("//Inciciando protocolo de revisión...");
            System.out.println("Eliminando evento anterior: " + pila.eliminarUltimo());
            System.out.println("Eliminando evento anterior: " + pila.eliminarUltimo());
            System.out.println("Eliminando evento anterior: " + pila.eliminarUltimo());
        }

        System.out.println("\n-- Estado actual de la bitácira --");
        System.out.println("Total de eventos actuales: " + pila.tamano() + "/" + pila.totalEventos()+" restantes");
        System.out.println("Evento en la cima de la pila: " + pila.consultarUltimo());
    }
}
