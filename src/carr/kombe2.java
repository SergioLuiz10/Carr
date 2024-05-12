package carr;

public abstract class kombe2 {
    protected int velocidade2;
    protected String nome2;

    public kombe2(int velocidade2) {
        this.velocidade2 = velocidade2;
        acelerar2();
    }

    public int getVelocidade2() {
        return velocidade2;
    }

    public void setVelocidade2(int velocidade2) {
        this.velocidade2 = velocidade2;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public void setVelocidade1(int velocidade2) {
        this.velocidade2 = velocidade2;
    }
    public abstract void acelerar2();
}
