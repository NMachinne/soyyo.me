import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int num = 0, opcion = 0, facto = 1, Otronum = 1, multi = 0, fibo, cambio = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("escribe un numero del 1 al 15(0 para terminar): ");
        num = teclado.nextInt();

        do {
            System.out.println(
                    "\n0. abandonar programa \n" + "1. factorial del numero \n" + "2. tabla multiplicar del numero \n"
                            + "3. Serie fibonacci del numero \n" + "4. cambiar numero \n");
            opcion = teclado.nextInt();
            switch (opcion) {
            // esto de abajo es para que termine programa.
            case 0:
                System.out.println("termino el programa");
                break;
            // esto de abajo es para hacer factorial de un numero escrito por teclado.
            case 1:
                do {
                    facto *= Otronum;
                    Otronum++;
                } while (Otronum <= num);
                System.out.println("el factorial de " + num + " es: " + facto);
                break;
            // esto de abajo es para hacer la tabla de multiplicar de un numero escrito por
            // teclado.
            case 2:
                System.out.println("la tabla de multiplicar de " + num + " es: ");
                while (multi <= 10) {
                    System.out.println(+num + "X" + multi + "es: " + num * multi);
                    multi++;
                }
                break;
            // esto de abajo es para hacer una serie de fibonacci de un numero escrito por
            // teclado.
            case 3:

                break;
            // esto de abajo es para cambiar el numero escrito.
            case 4:
                System.out.print("escribe un numero nuevo: ");
                cambio = teclado.nextInt();
                num = cambio;
                break;

            // esto de abajo es cuando se introduce un numero erroneo.
            default:
                System.out.println("ERROR, introduce un numero valido");
            }
        } while (num != 0);
        teclado.close();
    }
}