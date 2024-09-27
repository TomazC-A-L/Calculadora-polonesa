/*
 * A classe fila implementa a estrutura básica de uma fila e seus métodos.
 * Ela recebe objetos Celula e os organiza em uma fila padrão, onde o primeiro
 * a ser adicionado será sempre o primeiro a sair.
 */
public class Fila {

    public Celula frente;
    public Celula fim;

    public Fila () {
        this.frente = null;
        this.fim = null;
    }

    // recebe um objeto Celula e o insere no final da fila.
    public void enfileirar(Celula valor) { 
        if (vazia()) {
            frente = valor;
            fim = valor;
        } else {
            fim.prox = valor;
            fim = valor;
        }
    }

    // remove o primeiro elemento da fila.
    public String desenfileirar(){
        if (vazia()) {
            return null;
        } else {
            String aux = frente.getValor();
            frente = frente.prox;
            if (vazia()){
                fim = null;
            }
            return aux;
        }
    }
    // verifica se o primeiro elemento da fila é vazio, se for, a fila esta vazia.
    public Boolean vazia() {
        return frente == null;
    }

    public Celula getFim() {
        return fim;
    }

    public Celula getFrente() {
        return frente;
    }

    public void setFim(Celula fim) {
        this.fim = fim;
    }

    public void setFrente(Celula frente) {
        this.frente = frente;
    }
}