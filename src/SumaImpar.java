import java.util.Scanner;
public class SumaImpar {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de números impares que quiere sumar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int i = 1;
        int suma = 1;

        while(i<cantidad){
            i+=1;
            if(i%2>0) {
                suma += i;
            }
        }
        System.out.println(suma);


    }
}
