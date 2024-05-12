package carr;

public abstract class kombe {
    protected int velocidade1;
    protected String nome;

    public kombe(int velocidade) {
        this.velocidade1 = velocidade;
        acelerar();
    }

    public int getVelocidade1() {
        return velocidade1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidade1(int velocidade1) {
        this.velocidade1 = velocidade1;
    }
    public abstract void acelerar();
}
