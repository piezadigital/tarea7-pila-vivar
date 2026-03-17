public class BitacoraStack {
    
    private String[] pila;
    private int tope;
    
    public BitacoraStack(int tamano){
        pila = new String[tamano];
        tope = -1;
    }

    public boolean estaVacia(){
        return tope == -1;
    }

    public int totalEventos(){
        int total = pila.length;
        return total;
    }

    public void registrar(String elemento){
        if(tope == pila.length -1){
            System.out.println("La pila se ha llenado");
            return;
        }
        tope++;
        pila[tope] = elemento;
    }

    public String consultarUltimo(){
        if(estaVacia()){
            throw new IllegalStateException("La Pila está vacía");
        }
        return pila[tope];
    }

    public String eliminarUltimo(){
        if(estaVacia()){
            throw new IllegalStateException("La Pila está vacía");
        }
        return pila[tope--];
    }
}
