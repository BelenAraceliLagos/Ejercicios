import java.util.Scanner;
public class SecuenciaFibonacci {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de numeros que desea mostrar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();

        int numero1 = 0;
        int numero2 = 1;

        for (int i = 0; i <= cantidad; i++){
            System.out.println(numero1);
            int aux = numero1+numero2;
            numero1 = numero2;
            numero2 = aux;
        }

    }
}
