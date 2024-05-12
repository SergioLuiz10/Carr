package carr;

import java.util.Random;

public class kombeFot extends kombe {
    public kombeFot(int velocidade) {
        super(velocidade);
    }
    @Override
    public void acelerar() {
        Random rand = new Random();
        int acelerador = rand.nextInt(3)+1;
        velocidade1 += acelerador;
    }
}
