public class Laberinto {

    private final int TAMAÑO;
    private char[][] tablero;
    private Coordenada entrada, salida;
    private Pila pilaCaminos;
    private boolean[][] visitados;


    public Laberinto(int tamaño, char[][] tablero, Coordenada entrada, Coordenada salida) {
        this.TAMAÑO = tamaño;
        this.tablero = tablero;
        this.entrada = entrada;
        this.salida = salida;
        this.pilaCaminos = new Pila();
        this.visitados = new boolean[TAMAÑO][TAMAÑO];
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                this.visitados[i][j] = false;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i <= TAMAÑO + 1; i++) {
            System.out.print("X");
        }
        System.out.println();
        for (int i = 0; i < TAMAÑO; i++) {
            if (i != entrada.getFila()) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j < TAMAÑO; j++) {
                System.out.print(tablero[i][j]);
            }
            if (i != salida.getFila()) {
                System.out.println("X");
            } else {
                System.out.println(" ");
            }
        }
        for (int i = 0; i <= TAMAÑO + 1; i++) {
            System.out.print("X");
        }
        System.out.println();
        System.out.println();
    }



    private boolean esCaminoValidoNuevo(Coordenada coordenada) {
        // TODO Implementar este método
        return false; // Eliminar el return al implementar el método
    }


    public boolean existeCamino() {
        // TODO Implementar este método
        return false; // Eliminar el return al implementar el método
    }


}

