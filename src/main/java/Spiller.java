public abstract class Spiller {

    private String navn;
    private int point;

    public Spiller(String navn) {
        this.navn = navn;
        this.point = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getPoint() {
        return point;
    }

    public void tilføjPoint() {
        point++;
    }

    public abstract Håndtegn valgtHåndtegn();

}
