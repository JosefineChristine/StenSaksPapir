import java.util.Random;

public class Computerspiller extends Spiller {

    Random random = new Random();

    public Computerspiller(String navn) {
        super(navn);
    }

    @Override
    public Håndtegn valgtHåndtegn() {

        return Håndtegn.values()[random.nextInt(Håndtegn.values().length)];

    }



}
