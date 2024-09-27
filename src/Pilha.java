/*
 * A classe Pilha implementa a estrutura básica de uma Pilha e seus métodos.
 * Ela recebe objetos Celula e os organiza em uma pilha padrão, onde o ultimo
 * a ser adicionado será sempre o primeiro a sair.
 */
public class Pilha {
    
    public Celula topo;

    public Pilha() {
        topo = null;
    }

    // recebe um objeto Celula e o insere no topo da pilha.
    public void empilhar(Celula celula) {
        celula.prox = topo;
        topo = celula;
    }

    // remove o ultimmo elemento da pilha.
    public Celula desempilhar() {
        Celula aux = topo;
        topo = topo.prox;
        return aux;
    }

    // verifica se o topo elemento da pilha é vazio, se for, a pilha esta vazia.
    public boolean vazia(){
        return (topo == null);
    }

    public Celula getTopo() {
        return topo;
    }

    public void setTopo(Celula topo) {
        this.topo = topo;
    }
}
    