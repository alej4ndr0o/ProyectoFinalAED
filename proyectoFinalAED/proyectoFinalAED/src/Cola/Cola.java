package Cola;

import proyectofinalaed.Videojuego;
import Lista.Nodo;

public class Cola {
    public Nodo frente, finalCola;

    public Cola() {
        frente = finalCola = null;
    }

    // Inserción (enqueue)
    public void insertar(Videojuego videojuego) {
        Nodo nuevoNodo = new Nodo(videojuego);
        if(estaVacia()) {
            frente=nuevoNodo; finalCola=nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    // Borrado (dequeue)
    public Videojuego borrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return null;
        }
        Videojuego videojuego = frente.videojuego;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return videojuego;
    }

    // Mostrar la cola

    public void mostrarCola(){
          if(estaVacia()){
              System.out.println("Cola vacia");
              return;
          }
          Nodo actual=frente;
          while(actual != null){
              actual.videojuego.mostrar();
              actual=actual.siguiente;
          }
    }
    
      public boolean estaVacia(){
        return frente==null;
    }
}

