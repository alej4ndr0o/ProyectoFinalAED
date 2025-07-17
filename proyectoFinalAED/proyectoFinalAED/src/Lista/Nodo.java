package Lista;

import proyectofinalaed.Videojuego;

public class Nodo {
   public Videojuego videojuego;
    public Nodo siguiente;

    public Nodo(Videojuego videojuego) {
        this.videojuego = videojuego;
        this.siguiente = null;
    }
}
