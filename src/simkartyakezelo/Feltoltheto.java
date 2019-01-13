
package simkartyakezelo;

public class Feltoltheto extends Kartya {
    private int egyeneleg;

    public Feltoltheto(int szam, int pin, int puk, int egyenleg) {
        super(szam, pin, puk);
        this.egyeneleg = egyenleg;
    }

    public int getEgyeneleg() {
        return egyeneleg;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s+" egyeneleg: " + this.egyeneleg;
    }
    
    
}
