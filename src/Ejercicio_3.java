import java.util.Scanner;

/*Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
sacado y la menor.*/
public class Ejercicio_3 {

    //Notas
    int[] notas;

    Scanner scanner;

    //metodo por defecto

    public Ejercicio_3(){
    notas = new int[5];

        scanner = new Scanner(System.in);

    }

    //metodo ejecutar

    public void ejecutar(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTAS["+ i +"]: ");
            int nota = scanner.nextInt();
            notas[i] = nota;
        }
        //mostrar notas

        double suma = 0;
        double promedio;

        int min = 10;
        int max = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTAS["+ i +"]: "+ notas[i]);

            suma = suma + notas[i];

            if (notas[i] < min){
                min = notas[i];
            }
            if (notas[i] > max){
                max = notas[i];
            }
        }
        promedio = suma / notas.length;

        System.out.println("Promedio : "+ promedio);
        System.out.println("Maximo : "+ max);
        System.out.println("Minimo : "+ min);
    }
}
