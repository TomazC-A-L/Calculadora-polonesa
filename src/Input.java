/*
 * A classe input é responsável por receber o input do usuário e transforma-lo em uma fila onde cada celula
 * é um caracter da expressão. Com isso, conseguimos extrair cada elemento da expressão informada, facilitando
 * a manipulação dos dados mais a frente.
 */

import java.util.Scanner;
public class Input {

    public Input(String input) {
    }

    // recebe uma notação do usuário e splita ela em um array. Após isso, ela transforma o array e uma fila com celulas
    // que salvam um valor do tipo String. Feito isso, a fila é enviada para o processamento.
    public static void input(){
        System.out.println("Escreva a notação pós-fixada:");

        Scanner scan = new Scanner(System.in);
        String expressao = scan.nextLine();

        String[] elementos = expressao.split(" ");
        Fila fila = new Fila();
        Celula aux;

        for (int i = 0; i < elementos.length; i++) {
            aux = new Celula(elementos[i],0);
            fila.enfileirar(aux);
        }

        Calculadora calculadora = new Calculadora(fila);
        calculadora.calcular();
        scan.close();
    }
}
