import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite dois numeros para inicarmos: ");
        String num = scanner.next();
        String num2 =scanner.next();

        int num3= Integer.parseInt(num2);
        int num1= Integer.parseInt(num);
        int num4 = num1+num3;
        double resultado = Math.pow(num1,num3);
        double raiz = Math.sqrt(num1);
        int quadrado = num1*num1;

        System.out.println("a soma dos numeros são: "+num4);
        System.out.println("segundo resultado: "+ resultado);
        System.out.println("o terceiro resultado "+quadrado);
        System.out.println("o quarto resultado "+raiz);


    }
}
