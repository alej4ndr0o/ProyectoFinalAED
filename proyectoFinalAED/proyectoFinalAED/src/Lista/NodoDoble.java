package Lista;

import proyectofinalaed.Videojuego;

public class NodoDoble {
    public Videojuego videojuego;
    public NodoDoble anterior, siguiente;

    public NodoDoble(Videojuego videojuego) {
        this.videojuego = videojuego;
        this.anterior = null;
        this.siguiente = null;
    }
}
