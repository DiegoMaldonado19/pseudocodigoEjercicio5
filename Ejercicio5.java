/**
 * Importamos clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variables para contar las mujeres y hombres mayores de edad
         * Asi como la opcion, edad y el numero de edades que desea ingresar el usuario
         */
        int contadorMujeresMayores=0, contadorHombresMayores=0, edad, op=0, numeroDeEdadesAIngresar;

        /**
         * Solicitamos el numero de edades que se ingresaran al sistema
         */
        System.out.println("Ingrese el numero de edades que desea ingresar al sistema");
        numeroDeEdadesAIngresar = scanner.nextInt();

        /**
         * Ciclo for para repetir el ingreso de datos la cantidad de veces ingresadas por el usuario
         */
        for(int i=0; i<=numeroDeEdadesAIngresar; i++){
            /**
             * Opciones que se presentan para el usuario y posterior lectura de la misma
             */
            System.out.println("Ingresa una opcion");
            System.out.println("1) Hombre");
            System.out.println("2) Mujer");
            op = scanner.nextInt();

            /**
             * Condicional switch para poder almacenar la edad si es hombre o mujer
             */
            switch (op) {
                case 1:
                    /**
                     * Almacenamiento de edad y posterior comparacion para saber si es mayor de edad
                     */
                    System.out.println("Ingresa tu edad");
                    edad = scanner.nextInt();
                    if(edad>=18){
                        contadorHombresMayores += 1;
                    }
                    break;
                case 2:
                    /**
                     * Almacenamiento de edad y posterior comparacion para saber si es mayor de edad
                     */
                    System.out.println("Ingresa tu edad");
                    edad = scanner.nextInt();
                    if(edad>=18){
                        contadorMujeresMayores += 1;
                    }
                    break;

                default:
                    /**
                     * Si el usuario ingresa una opcion invalida el sistema le notificara
                     */
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
        /**
         * Imprimimos en pantalla la cantidad de hombres y mujeres mayores de edad
         */
        System.out.println("La cantidad de hombres mayores de edad es: "+contadorHombresMayores);
        System.out.println("La cantidad de mujeres mayores de edad es: "+contadorMujeresMayores);

    }
}
