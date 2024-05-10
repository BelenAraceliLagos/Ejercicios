import java.util.Scanner;
public class SumaImparLimite {
    public static void main(String[] args) {

        /*
        System.out.println("Ingrese la cantidad de números impares que quiere sumar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt(); */
        System.out.println("Ingrese el número mínimo para comenzar la suma: ");
        Scanner min = new Scanner(System.in);
        int minimo = min.nextInt();
        System.out.println("Ingrese el número máximo para terminar la suma: ");
        Scanner max = new Scanner(System.in);
        int maximo = max.nextInt();
        int i = minimo;
        int suma = 0;

        while(i<=maximo){

            if(i%2>0) {
                suma += i;
            }
            i++;
        }
        System.out.println(suma);


    }
}
