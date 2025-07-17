package proyectofinalaed;

public class Videojuego {
    public String titulo;
    public String desarrolladora;

    // Constructor
    public Videojuego(String titulo, String desarrolladora) {
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
    }

    // Método para mostrar el videojuego
    public void mostrar() {
        System.out.println("Título: " + titulo + ", Desarrolladora: " + desarrolladora);
    }

    // Sobrescribir el método toString para mejor visualización
    @Override
    public String toString() {
        return "[" + titulo + " - " + desarrolladora + "]";
    }
}
