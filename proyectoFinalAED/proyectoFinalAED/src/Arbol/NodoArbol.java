package Arbol;

import proyectofinalaed.Videojuego;

public class NodoArbol {
    public Videojuego videojuego;
    public NodoArbol izquierda, derecha;

    public NodoArbol(Videojuego videojuego) {
        this.videojuego = videojuego;
        this.izquierda = this.derecha = null;
    }
}
