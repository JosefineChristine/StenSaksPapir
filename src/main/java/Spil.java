import java.util.Scanner;

public class Spil {

    private Spiller s1;
    private Spiller s2;

    public Spil(Spiller s1, Spiller s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void start() {
        System.out.println("Velkommen til sten, saks, papir!");
        System.out.println("Spillet er bedst af tre.");

        int runde = 1;
        int runderMedPoint = 0;

        while (runderMedPoint < 3) {

            System.out.println();
            System.out.println("Runde " + runde + ": ");

            runde++;

            Håndtegn h1 = s1.valgtHåndtegn();
            Håndtegn h2 = s2.valgtHåndtegn();


            System.out.println(s1.getNavn() + " valgte " + h1.toString().toLowerCase());
            System.out.println(s2.getNavn() + " valgte " + h2.toString().toLowerCase());


            if (h1 == h2) {
                System.out.println("Runden er uafgjort");
                continue;
            }

            runderMedPoint++;
            Spiller vinder;
            Spiller taber;

            if ((h1 == Håndtegn.STEN && h2 == Håndtegn.SAKS) ||
                    (h1 == Håndtegn.SAKS && h2 == Håndtegn.PAPIR) ||
                    (h1 == Håndtegn.PAPIR && h2 == Håndtegn.STEN)) {
                vinder = s1;
            } else {
                vinder = s2;
            }

            if (vinder == s1) {
                taber = s2;
            } else {
                taber = s1;
            }

            vinder.tilføjPoint();

            int pointS1 = s1.getPoint();
            int pointS2 = s2.getPoint();

            System.out.println(vinder.getNavn() + " har vundet runden og har nu " + vinder.getPoint() + " point");
            System.out.println(taber.getNavn() + " har " + taber.getPoint() + " point");

            Spiller vinderBedstAfTre;

            if (pointS1 > pointS2) {
                vinderBedstAfTre = s1;
            } else {
                vinderBedstAfTre = s2;
            }

            if (vinderBedstAfTre.getPoint() >= 2) {
                System.out.println();
                System.out.println(vinderBedstAfTre.getNavn() + " har vundet spillet!");
            }

        }

        System.out.println("Spillet er slut!");

    }

}
