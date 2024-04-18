import java.util.Scanner;

public class Menneskespiller extends Spiller {

    Scanner sc = new Scanner(System.in);

    public Menneskespiller(String navn) {
        super(navn);
    }

    @Override
    public Håndtegn valgtHåndtegn() {
        System.out.println("Skriv 'sten', 'saks' eller 'papir': ");
        try {
            return Håndtegn.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Forkert input.");
        } return valgtHåndtegn();
    }

}
