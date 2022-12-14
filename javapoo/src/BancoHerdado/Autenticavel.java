package BancoHerdado;

// 'contrato' Autenticavel
// quem assinar esse 'contrato' precisa implementar os métodos setSenha, metodo autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autenticar(int senha);

}
