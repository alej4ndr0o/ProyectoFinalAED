package Lista;

import proyectofinalaed.Videojuego;

public class ListaDobleEnlazada {
    public NodoDoble cabeza;
    public NodoDoble cola;

    public ListaDobleEnlazada() {
        cabeza = null;
        cola = null;
    }

    // Método para insertar al final de la lista
    public void insertar(Videojuego videojuego) {
        NodoDoble nuevo = new NodoDoble(videojuego);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Método para buscar un videojuego por título
    public NodoDoble buscar(String titulo) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.videojuego.titulo.equals(titulo)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Método para borrar un videojuego por título
    public void borrar(String titulo) {
        NodoDoble actual = buscar(titulo);
        if (actual == null) {
            System.out.println("Videojuego no encontrado.");
            return;
        }

        // Caso 1: Nodo único
        if (actual == cabeza && actual == cola) {
            cabeza = cola = null;
        }
        // Caso 2: Nodo inicial
        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }
        // Caso 3: Nodo final
        else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
        }
        // Caso 4: Nodo intermedio
        else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }
        System.out.println("Videojuego eliminado: " + titulo);
    }

    // Método para mostrar todos los videojuegos
    public void mostrar() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            actual.videojuego.mostrar();
            actual = actual.siguiente;
        }
    }

}
