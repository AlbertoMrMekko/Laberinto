public class Principal {

    public static void main(String[] args) {
        final int TAMAÑO = 6;
        Coordenada entrada, salida;
        char[][] tabla = new char[TAMAÑO][TAMAÑO];
        String fila0 = "X     ";
        String fila1 = "  X X ";
        String fila2 = "X X XX";
        String fila3 = "   XX ";
        String fila4 = " X XX ";
        String fila5 = " X    ";
        tabla[0] = fila0.toCharArray();
        tabla[1] = fila1.toCharArray();
        tabla[2] = fila2.toCharArray();
        tabla[3] = fila3.toCharArray();
        tabla[4] = fila4.toCharArray();
        tabla[5] = fila5.toCharArray();
        entrada = new Coordenada(1,0);
        salida = new Coordenada(3, TAMAÑO - 1);
        System.out.println("USANDO LA CLASE Pila:");
        Laberinto laberinto = new Laberinto(TAMAÑO, tabla, entrada, salida);
        laberinto.mostrar();
        if (laberinto.existeCamino()) {
            System.out.println("Existe camino desde la entrada a la salida");
        } else {
            System.out.println("No existe camino desde la entrada a la salida");
        }

        System.out.println("===================================================="); // ejercicios de repaso.
        Pila pila = new Pila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);
        pila.apilar(7);
        pila.apilar(8);
        pila.apilar(9);
        pila.apilar(0);
        pila.mostrar();
        if(pila.estaContenidoIterativo(pila,10))
            System.out.println("El num 10 está contenido en la pila, en la posición " + pila.posicion(pila, 10));
        else
            System.out.println("El num 10 no está contenido en la pila.");
        if(pila.estaContenidoIterativo(pila,5))
            System.out.println("El num 5 está contenido en la pila, en la posición " + pila.posicion(pila, 5));
        else
            System.out.println("El num 5 no está contenido en la pila.");


    }
}

