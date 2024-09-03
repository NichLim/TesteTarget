import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<Integer>(Arrays.asList(0, 1));
        System.out.println("Insira o número que deseja buscar na sequencia: ");
        int numeroDesejado = userInput.nextInt();
        for (int i = 0; i < Integer.MAX_VALUE - 1; i++){
            if (i >= 2){
                fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2)); //calculando os numeros da sequencia
            } 
            if (fibonacci.get(i) == numeroDesejado){
                System.out.println("O numero " + numeroDesejado + " pertence a sequencia de fibonacci");
                break;
            }else{
                System.out.println("O numero " + numeroDesejado + " não pertence a sequencia de fibonacci");
                break;   
            }//comparando e imprimindo baseado no valor solicitado
        }
    }
}