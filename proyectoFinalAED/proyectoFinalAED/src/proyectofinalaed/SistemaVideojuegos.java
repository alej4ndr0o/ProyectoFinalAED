package proyectofinalaed;

import Arreglo.ColeccionArreglo;
import Arbol.ArbolBinario;
import Lista.ListaEnlazada;
import Cola.Cola;
import Lista.ListaCircular;
import Pila.Pila;
import Lista.ListaDobleEnlazada;
import Lista.Nodo;
import Lista.NodoDoble;

    public class SistemaVideojuegos {
    public static void main(String[] args) {
        ///////////////////////////////////////////
        // Creación de videojuegos
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo");
        Videojuego juego2 = new Videojuego("God of War", "Santa Monica Studio");
        Videojuego juego3 = new Videojuego("Minecraft", "Mojang");
        Videojuego juego4 = new Videojuego("Grand Theft Auto V", "Rockstar Games");
        Videojuego juego5 = new Videojuego("FIFA 2023", "EA Sports");

        ///////////////////////////////////////////
        // Arreglo
        ColeccionArreglo coleccionArreglo = new ColeccionArreglo(5);
        coleccionArreglo.insertar(juego1);
        coleccionArreglo.insertar(juego2);
        coleccionArreglo.insertar(juego3);
        coleccionArreglo.insertar(juego4);
        coleccionArreglo.insertar(juego5);

        System.out.println("Videojuegos en el Arreglo:");
        coleccionArreglo.mostrarVideojuegos();

        coleccionArreglo.ordenar();
        System.out.println("\nVideojuegos ordenados en el Arreglo:");
        coleccionArreglo.mostrarVideojuegos();

        coleccionArreglo.borrar("Halo");
        System.out.println("\nVideojuegos después de borrar 'Halo' del Arreglo:");
        coleccionArreglo.mostrarVideojuegos();

        Videojuego encontrado = coleccionArreglo.buscar("Grand Theft Auto V");
        System.out.println("\nResultado de búsqueda en el Arreglo:");
        if (encontrado != null) {
            encontrado.mostrar();
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        ///////////////////////////////////////////
        // Lista Enlazada
        ListaEnlazada coleccionLista = new ListaEnlazada();
        coleccionLista.insertar(juego1);
        coleccionLista.insertar(juego2);
        coleccionLista.insertar(juego3);
        coleccionLista.insertar(juego4);
        coleccionLista.insertar(juego5);

        System.out.println("\nVideojuegos en la Lista Enlazada:");
        coleccionLista.mostrarVideojuegos();

        coleccionLista.ordenar();
        System.out.println("\nVideojuegos ordenados en la Lista Enlazada:");
        coleccionLista.mostrarVideojuegos();

        coleccionLista.borrar("Minecraft");
        System.out.println("\nVideojuegos después de borrar 'Minecraft' de la Lista Enlazada:");
        coleccionLista.mostrarVideojuegos();

        encontrado = coleccionLista.buscar("FIFA 2023");
        System.out.println("\nResultado de búsqueda en la Lista Enlazada:");
        if (encontrado != null) {
            encontrado.mostrar();
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        ///////////////////////////////////////////
        // Lista Doble Enlazada
        ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
        listaDoble.insertar(juego1);
        listaDoble.insertar(juego2);
        listaDoble.insertar(juego3);
        listaDoble.insertar(juego4);
        listaDoble.insertar(juego5);

        System.out.println("\nVideojuegos en la Lista Doble Enlazada:");
        listaDoble.mostrar();

        NodoDoble encontradoDoble = listaDoble.buscar("God of War");
        System.out.println("\nBuscando 'God of War' en la Lista Doble Enlazada:");
        if (encontradoDoble != null) {
            encontradoDoble.videojuego.mostrar();
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        listaDoble.borrar("The Legend of Zelda");
        System.out.println("\nVideojuegos después de borrar 'The Legend of Zelda' de la Lista Doble Enlazada:");
        listaDoble.mostrar();

        ///////////////////////////////////////////
        // Lista Circular
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.insertar(juego1);
        listaCircular.insertar(juego2);
        listaCircular.insertar(juego3);
        listaCircular.insertar(juego4);
        listaCircular.insertar(juego5);

        System.out.println("\nVideojuegos en la Lista Circular:");
        listaCircular.mostrar();

        Nodo encontradoCircular = listaCircular.buscar("God of War");
        System.out.println("\nBuscando 'God of War' en la Lista Circular:");
        if (encontradoCircular != null) {
            encontradoCircular.videojuego.mostrar();
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        listaCircular.borrar("Grand Theft Auto V");
        System.out.println("\nVideojuegos después de borrar 'Grand Theft Auto V' de la Lista Circular:");
        listaCircular.mostrar();

        listaCircular.borrar("Fortnite");
        System.out.println("\nIntentando borrar 'Fortnite' de la Lista Circular:");
        listaCircular.mostrar();

        ///////////////////////////////////////////
        // Pila
        Pila pila = new Pila();
        pila.insertar(juego1);
        pila.insertar(juego2);
        pila.insertar(juego3);

        System.out.println("\nPila de Videojuegos:");
        pila.mostrarPila();

        pila.borrar();
        System.out.println("\nPila después de borrar un videojuego:");
        pila.mostrarPila();

        ///////////////////////////////////////////
        // Cola
        Cola cola = new Cola();
        cola.insertar(juego1);
        cola.insertar(juego2);
        cola.insertar(juego3);

        System.out.println("\nCola de Videojuegos:");
        cola.mostrarCola();

        cola.borrar();
        System.out.println("\nCola después de borrar un videojuego:");
        cola.mostrarCola();

        ///////////////////////////////////////////
        // Árbol Binario
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(juego1);
        arbol.insertar(juego2);
        arbol.insertar(juego3);
        arbol.insertar(juego4);
        arbol.insertar(juego5);

        System.out.println("\nÁrbol Binario (Inorden):");
        arbol.mostrarInorden();

        encontrado = arbol.buscar("Call of Duty");
        System.out.println("\nResultado de búsqueda en el Árbol Binario:");
        if (encontrado != null) {
            encontrado.mostrar();
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        arbol.eliminar("Call of Duty");
        System.out.println("\nÁrbol después de eliminar:");
        arbol.mostrarInorden();
    }
}
