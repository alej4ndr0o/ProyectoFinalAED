package Arbol;

import proyectofinalaed.Videojuego;

public class ArbolBinario {
    public NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Inserción
    public void insertar(Videojuego videojuego) {
        raiz = insertarRec(raiz, videojuego);
    }

    public NodoArbol insertarRec(NodoArbol raiz, Videojuego videojuego) {
        if (raiz == null) {
            raiz = new NodoArbol(videojuego);
            return raiz;
        }
        if (videojuego.titulo.compareTo(raiz.videojuego.titulo) < 0) {
            raiz.izquierda = insertarRec(raiz.izquierda, videojuego);
        } else if (videojuego.titulo.compareTo(raiz.videojuego.titulo) > 0) {
            raiz.derecha = insertarRec(raiz.derecha, videojuego);
        }
        return raiz;
    }
    // Búsqueda
    public Videojuego buscar(String titulo) {
        return buscarRec(raiz, titulo);
    }

    public Videojuego buscarRec(NodoArbol raiz, String titulo) {
        if (raiz == null || raiz.videojuego.titulo.equals(titulo)) {
            return raiz != null ? raiz.videojuego : null;
        }
        if (titulo.compareTo(raiz.videojuego.titulo) < 0) {
            return buscarRec(raiz.izquierda, titulo);
        }
        return buscarRec(raiz.derecha, titulo);
    }

    // Mostrar el árbol en orden
    public void mostrarInorden() {
        mostrarInordenRec(raiz);
    }

    public void mostrarInordenRec(NodoArbol raiz) {
        if (raiz != null) {
            mostrarInordenRec(raiz.izquierda);
            raiz.videojuego.mostrar();
            mostrarInordenRec(raiz.derecha);
        }
    }

    // Eliminar
    public void eliminar(String titulo) {
        raiz = eliminarRec(raiz, titulo);
    }

    public NodoArbol eliminarRec(NodoArbol raiz, String titulo) {
        if (raiz == null) {
            System.out.println("Videojuego no encontrado.");
            return raiz;
        }

        if (titulo.compareTo(raiz.videojuego.titulo) < 0) {
            raiz.izquierda = eliminarRec(raiz.izquierda, titulo);
        } else if (titulo.compareTo(raiz.videojuego.titulo) > 0) {
            raiz.derecha = eliminarRec(raiz.derecha, titulo);
        } else {
            // Nodo encontrado
            if (raiz.izquierda == null && raiz.derecha == null) {
                // Caso 1: Nodo sin hijos
                return null;
            } else if (raiz.izquierda == null) {
                // Caso 2: Nodo con un hijo (derecha)
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                // Caso 2: Nodo con un hijo (izquierda)
                return raiz.izquierda;
            } else {
                // Caso 3: Nodo con dos hijos
                NodoArbol sucesor = encontrarMin(raiz.derecha);
                raiz.videojuego = sucesor.videojuego;
                raiz.derecha = eliminarRec(raiz.derecha, sucesor.videojuego.titulo);
            }
        }
        return raiz;
    }

    // Encuentra el nodo con el valor más pequeño en un subárbol
    public NodoArbol encontrarMin(NodoArbol raiz) {
        while (raiz.izquierda != null) {
            raiz = raiz.izquierda;
        }
        return raiz;
    }
}

