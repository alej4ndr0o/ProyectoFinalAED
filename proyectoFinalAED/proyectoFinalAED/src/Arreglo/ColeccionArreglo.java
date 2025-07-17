package Arreglo;

import proyectofinalaed.Videojuego;

public class ColeccionArreglo {
    public Videojuego[] videojuegos;
    public int tamano;

    public ColeccionArreglo(int capacidad) {
        videojuegos = new Videojuego[capacidad];
        tamano = 0;
    }

    // Inserción
    public void insertar(Videojuego videojuego) {
        if (tamano < videojuegos.length) {
            videojuegos[tamano++] = videojuego;
        } else {
            System.out.println("No hay espacio para más videojuegos.");
        }
    }

    // Borrado
    public void borrar(String titulo) {
        for (int i = 0; i < tamano; i++) {
            if (videojuegos[i].titulo.equals(titulo)) {
                for (int j = i; j < tamano - 1; j++) {
                    videojuegos[j] = videojuegos[j + 1];
                }
                videojuegos[--tamano] = null;
                return;
            }
        }
        System.out.println("Videojuego no encontrado.");
    }

    // Ordenar por título (orden alfabético)
    public void ordenar() {
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = i + 1; j < tamano; j++) {
                if (videojuegos[i].titulo.compareTo(videojuegos[j].titulo) > 0) {
                    Videojuego temp = videojuegos[i];
                    videojuegos[i] = videojuegos[j];
                    videojuegos[j] = temp;
                }
            }
        }
    }

    // Búsqueda de videojuego por título
    public Videojuego buscar(String titulo) {
        for (int i = 0; i < tamano; i++) {
            if (videojuegos[i].titulo.equals(titulo)) {
                return videojuegos[i];
            }
        }
        return null;
    }

    // Mostrar los videojuegos
    public void mostrarVideojuegos() {
        for (int i = 0; i < tamano; i++) {
            videojuegos[i].mostrar();
        }
    }
    
}
