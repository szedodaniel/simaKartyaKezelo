
package simkartyakezelo;

public class Szamla {

    private int osszeg;
    private boolean fizetett;

    public Szamla(int osszeg, boolean fizetett) {
        this.osszeg = osszeg;
        this.fizetett = fizetett;
    }

    @Override
    public String toString() {
        return String.format("Számla összege: %d, kifizetve: %b", this.osszeg, this.fizetett);
    }
    
    
}
