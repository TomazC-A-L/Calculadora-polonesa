/*
 * A classe Celula cria objetos que armazenam Strings e inteiros.
 * As Strings são usadas para receber os componentes da expressão
 * passada pelo usuário. 
 * O inteiro "resultado" armazena o resultado da operação contida
 * na celula (se houver, caso contrário, armazena apenas seu valor numerico
 * ou, no caso da String salvar um operador, o valor é 0)
 */
public class Celula {
    
    private String valor;
    private int resultado;
    public Celula prox;

    public Celula(String valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
        this.prox = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

}