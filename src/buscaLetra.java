import java.util.ArrayList;

public class buscaLetra {
    public static void main(String[] args) {
        String pangramaExemplo = "Bancos fúteis pagavam-lhe queijo, whisky e xadrez"; //pangrama de exemplo
        char letraBuscada = 'a'; //letra a ser buscada
        ArrayList<Integer> posicoesDaLetra = new ArrayList<Integer>(); //ArrayList para guardar as posições onde a letra aparece na frase
        int count = 0; // inicializando a variável que guarda a quantidade de vezes que a letra aparece
        char[] arrayDaFrase = pangramaExemplo.toCharArray(); // transformando a frase em um array de char para ser percorrido

        for (int index = 0; index < arrayDaFrase.length; index++) { //percorre o array criado
            if (arrayDaFrase[index] == letraBuscada) { //compara durante o char do array com a letra desejada em cada iteração 
                count++; //incrementa o contador de aparições
                posicoesDaLetra.add(index + 1); //incrementa a lista de posições com adaptação pois o índice começa em 0
            }
        }

        System.out.println("A letra '" + letraBuscada + "' aparece na frase '" + pangramaExemplo + "' " + count + " vezes, nas posições " + posicoesDaLetra);
    }
}
