import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("digite um numero qualquer: ");
        String numero2 = scanner.next();
        int num=1;
        int num2=Integer.parseInt(numero2);
        int aux;
        aux=num;
        num=num2;
        num2=aux;

        System.out.println("numero 1: "+num);
        System.out.println("numero 2: "+num2);

    }
}
