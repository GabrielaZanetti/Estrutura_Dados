package arvore.com.br;

public class Arvore {

    private Elemento ele;
    private Arvore dir;
    private Arvore esq;

    public Arvore() {
        this.ele = null;
        this.esq = null;
        this.dir = null;
    }

    public Arvore(Elemento elem) {
        this.ele = elem;
        this.dir = null;
        this.esq = null;
        System.out.println("Cria elemento " + elem.getValor());
    }

    // verificações
    public boolean isEmpty() {
        return (this.ele == null);
    }

    public void inserir(Elemento novo) {
        if (isEmpty()) {
            this.ele = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValor() < this.ele.getValor()) {  // Insere na esquerda
                if (this.esq == null) {  // nó folha
                    this.esq = novaArvore;
                    System.out.println("Elemento" + novo.getValor() + "inserido a esquerda de " + this.ele.getValor());
                } else {
                    this.esq.inserir(novo); // passa para a sub-árvore esquerda
                }
            } else if (novo.getValor() > this.ele.getValor()) { // Insere na direita
                if (this.dir == null) {
                    this.dir = novaArvore;
                    System.out.println("Elemento" + novo.getValor() + "inserido a direita de " + this.ele.getValor());

                } else {
                    this.dir.inserir(novo); // passa para a sub-árvore direita
                }
            }
        }
    }

    // Método de Pesquisa
    public boolean busca(int valor) {
        if (isEmpty()) {
            return false;
        }
        if (this.ele.getValor() == valor) {
            return true;
        } else {
            if (valor < this.ele.getValor()) {
                if (this.esq == null) {
                    return false;
                } else {
                    return this.esq.busca(valor); // segue a subarvore esquerda
                }
            } else if (valor > this.ele.getValor()) {
                if (this.dir == null) {
                    return false;
                } else {
                    return this.dir.busca(valor); // segue a subarvore direita
                }
            }
            return false;
        }
    }

    public void setElemento(Elemento ele) {
        this.ele = ele;
    }

    public void setDir(Arvore dir) {
        this.dir = dir;
    }

    public void setEsq(Arvore esq) {
        this.esq = esq;
    }
}
