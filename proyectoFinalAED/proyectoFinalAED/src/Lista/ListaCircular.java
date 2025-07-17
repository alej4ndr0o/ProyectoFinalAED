package Lista;

import proyectofinalaed.Videojuego;

public class ListaCircular {
    private Nodo cabeza;

    public ListaCircular() {
        cabeza = null;
    }

    // Método para insertar al final de la lista
    public void insertar(Videojuego videojuego) {
        Nodo nuevo = new Nodo(videojuego);
        if (this.estaVacia()) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // Método para buscar un videojuego por título
    public Nodo buscar(String titulo) {
        if (cabeza == null) return null;

        Nodo actual = cabeza;
        do {
            if (actual.videojuego.titulo.equals(titulo)) {
                return actual;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        return null;
    }

    // Método para borrar un videojuego por título
    public void borrar(String titulo) {
        if (this.estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
 Nodo actual = cabeza, previo = null;

        do {
            if (actual.videojuego.titulo.equals(titulo)) {
                if (actual == cabeza && actual.siguiente == cabeza) {
                    // Nodo único
                    cabeza = null;
                } else if (actual == cabeza) {
                    // Nodo inicial
                    Nodo ultimo = cabeza;
                    while (ultimo.siguiente != cabeza) {
                        ultimo = ultimo.siguiente;
                    }
                    cabeza = cabeza.siguiente;
                    ultimo.siguiente = cabeza;
                } else {
                    // Nodo intermedio o final
                    previo.siguiente = actual.siguiente;
                }
                System.out.println("Videojuego eliminado: " + titulo);
                return;
            }
            previo = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Videojuego no encontrado.");
    }


    // Método para mostrar todos los videojuegos
    public void mostrar() {
      if(this.estaVacia()) System.out.println("Lista Vacia");
          else{
        Nodo actual = cabeza;
        do {
            actual.videojuego.mostrar();
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
      } 
     public boolean estaVacia(){
        return cabeza==null;
    }
}

