package Lista;

import proyectofinalaed.Videojuego;

public class ListaEnlazada {
    public Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Inserción
    public void insertar(Videojuego videojuego) {
        Nodo nuevoNodo = new Nodo(videojuego);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Borrado
    public void borrar(String titulo) {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }
        if (cabeza.videojuego.titulo.equals(titulo)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        while (temp.siguiente != null && !temp.siguiente.videojuego.titulo.equals(titulo)) {
            temp = temp.siguiente;
        }
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
        } else {
            System.out.println("Videojuego no encontrado.");
        }
    }

    // Ordenar
    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) return;

        // Variables para el ordenamiento
        Nodo actual = cabeza;

        // Ordenar la lista por título
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            while (siguiente != null) {
                if (actual.videojuego.titulo.compareTo(siguiente.videojuego.titulo) > 0) {
                    // Intercambiar los videojuegos
                    Videojuego temp = actual.videojuego;
                    actual.videojuego = siguiente.videojuego;
                    siguiente.videojuego = temp;
                }
                siguiente = siguiente.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    // Búsqueda
    public Videojuego buscar(String titulo) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.videojuego.titulo.equals(titulo)) {
                return temp.videojuego;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    // Mostrar videojuegos
    public void mostrarVideojuegos() {
        Nodo temp = cabeza;
        while (temp != null) {
            temp.videojuego.mostrar();
            temp = temp.siguiente;
        }
    }
}

