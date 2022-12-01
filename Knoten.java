public class Knoten {

    private int nr;
    private String beschreibung;
    private int[] vorgaenger;
    private Knoten vorgaenger1;
    private double dauer;

    public Knoten(int nr,
               String beschreibung,
               int[] vorgaenger,
               double dauer) {
        this.nr = nr;
        this.beschreibung = beschreibung;
        this.vorgaenger = vorgaenger;
        this.dauer = dauer;
    }
    public int getNr() {
        return this.nr;
    }
    public String getBeschreibung() {
        return this.beschreibung;
    }
    public int[] getVorgaenger() {
        return this.vorgaenger;
    }

    public double getDauer() {
        return this.dauer;
    }

    public String toString() {
        return "NR: " + this.nr + "\n" +
                "Beschreibung: " + this.beschreibung + "\n" +
                "Vorgaenger Anzahl: " + this.vorgaenger.length + "\n" +
                "Dauer: " + this.dauer;
    }
    public double SAZ() {
        return 0;
    }
    public double SEZ() {
        return 0;
    }
    public double FEZ() {
        return this.FAZ() + this.dauer;
    }
    public double FAZ() {
        return this.vorgaenger1.FEZ();
    }
}
