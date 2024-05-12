package carr;

import java.util.Random;

public class kombe2fot2 extends kombe2 {
    public kombe2fot2(int velocidade2) {
        super(velocidade2);
    }

    @Override
    public void acelerar2() {
        Random rand = new Random();
        int acelerador = rand.nextInt(3)+1;
        velocidade2 += acelerador;
    }

}
