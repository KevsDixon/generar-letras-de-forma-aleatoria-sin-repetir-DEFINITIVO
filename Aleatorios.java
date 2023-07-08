package aleatorios;


import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Aleatorios {

    public static void main(String[] args) {

             Scanner objeto = new Scanner(System.in);

        int tamaño;

        System.out.println("Seleccione la Cantidad de Letras que desee generar");
        tamaño = objeto.nextInt();
        System.out.println("El Número de letras generadas de forma Aleatoria es: " + tamaño);

        char arreglo[] = new char[tamaño];

        for (int i = 0; i < arreglo.length; i++) {
            char aletorio;
            boolean repetida;

            do {
                repetida = false;
                aletorio = (char) (Math.random() * (26) + 'A');

                for (int j = 0; j < i; j++) {
                    if (arreglo[j] == aletorio) {
                        repetida = true;
                        break;
                    }
                }
            } while (repetida);

            arreglo[i] = aletorio;
            System.out.println("Posición: " + i + " = " + arreglo[i]);
        }

    }

}
