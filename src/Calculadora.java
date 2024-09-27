/*
 * A classe calculadora é responsável por traduzir e calcular a expressão recebida no input.
 * A lógica principal do algoritmo de tradução está descrita no README.
 */

public class Calculadora {
    private Pilha pilha;
    private Fila fila;

    public Calculadora(Fila fila) {
        this.pilha = new Pilha();
        this.fila = fila;
    }

    // Este método itera pela fila de elementos. A cada celula da fila, verifica-se se ela é um numero
    // ou um operador. Caso seja um número, apenas empilhamos em um pilha, caso contrário, desempilhamos
    // os dois ultimos números empilhados, concatenamos eles adicionando o operador em questão no meio.
    // Feito isso, calculamos o resultado desta concatenação, e juntando os dois novos valores, criamos uma
    // nova celula para ser empilhada na pilha.

    public void calcular() {
        Celula aux = fila.frente;
        while (aux != null){
            if (aux.getValor().equals("+") || aux.getValor().equals("-") || aux.getValor().equals("*") || aux.getValor().equals("/")) {
                
                int resultado = 0;

                Celula a = pilha.desempilhar();
                Celula b = pilha.desempilhar();
                String novaCelula = "(" + b.getValor() + aux.getValor() + a.getValor() + ")";

                resultado = operar(aux.getValor(), a, b);

                pilha.empilhar(new Celula(novaCelula,resultado));
            } else {
                pilha.empilhar(new Celula(aux.getValor(),Integer.parseInt(aux.getValor())));
            } 
            aux = aux.prox;
        }
        
        Celula resposta = pilha.desempilhar();
        System.out.println(resposta.getValor() + " = " + resposta.getResultado());
    }

    // O método operar recebe um operador e os dois elementos que foram desempilhados antes dele.
    // feito isso, o método identifica qual operação está sendo requisitada e realiza o calculo de acordo.
    private int operar(String operador, Celula operando1, Celula operando2) {
        int resultado = 0;
        
        switch (operador) {
            case "+":
                resultado = operando1.getResultado() + operando2.getResultado();
                break;

            case "-":
                resultado = operando2.getResultado() - operando1.getResultado();
                break;

            case "/":
                resultado = operando2.getResultado() / operando1.getResultado();
                break;

            case "*":
                resultado = operando1.getResultado() * operando2.getResultado();
                break;

            default:
                System.out.println("operador invalido: " + operador);
                break;
        }
        return resultado;
    }

    public Fila getFila() {
        return fila;
    }

    public Pilha getPilha() {
        return pilha;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public void setPilha(Pilha pilha) {
        this.pilha = pilha;
    }
}