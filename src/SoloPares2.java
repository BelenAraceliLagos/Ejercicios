import java.util.Scanner;
public class SoloPares2 {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de números pares que desea mostrar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int pares = 0;

        for(int i = 1; i <= cantidad; i++){

            pares = i*2;
            System.out.println(pares);
        }

    }

}
