package Pila;

import proyectofinalaed.Videojuego;
import Lista.Nodo;

public class Pila {
    public Nodo cima;

    public Pila() {
        cima = null;
    }

    // Inserción (push)
    public void insertar(Videojuego videojuego) {
        Nodo nuevoNodo = new Nodo(videojuego);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Borrado (pop)
    public Videojuego borrar() {
        if (cima == null) {
            System.out.println("Pila vacía.");
            return null;
        }
        Videojuego videojuego = cima.videojuego;
        cima = cima.siguiente;
        return videojuego;
    }

    // Mostrar la pila
    public void mostrarPila() {
        Nodo temp = cima;
        while (temp != null) {
            temp.videojuego.mostrar();
            temp = temp.siguiente;
        }
    }
}
