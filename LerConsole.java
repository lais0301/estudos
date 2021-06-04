import java.util.Scanner;

public class LerConsole {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("qual sua altura em metros? ");
        String altura = scanner.next();
        //int cm=100;
       float alt=Float.parseFloat(altura.replaceAll(",","."));
       float cm=alt*100;

        System.out.println("sua altura em centimetros é "+cm);
    }
}
