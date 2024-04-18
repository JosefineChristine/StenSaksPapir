public class Main {
    public static void main(String[] args) {
        Spil spil = new Spil(new Menneskespiller("Josefine"), new Computerspiller("Computeren"));
        spil.start();
    }
}
