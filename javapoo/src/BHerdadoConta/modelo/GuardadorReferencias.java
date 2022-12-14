package BHerdadoConta.modelo;

public class GuardadorReferencias {

    private Object[] referencia;
    private int ocupado;

    
    public GuardadorReferencias() {
        this.referencia = new Conta[10];
        this.ocupado = 0;   // inicia em zero
    }

    public void adiciona(Object ref) {
        this.ocupado++;  // "pula" para o próximo numero do array
        this.referencia[this.ocupado] = ref;  // adiciona cada conta criada a uma unidade do array
    }

    public int getTamanho() {
        return this.ocupado; // mostra o total de unidades ocupadas no array
    }

    public Object getPosicao(int posicao) {
        return this.referencia[posicao];  // devolve algo da conta informada (ex: getNumero)
    }

}
    

