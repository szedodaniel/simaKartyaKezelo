
package simkartyakezelo;

import java.util.ArrayList;
import java.util.List;


public class Elofizeteses extends Kartya{

    private List<Szamla> szamlak = new ArrayList<>();
    
    public Elofizeteses(int szam, int pin, int puk) {
        super(szam, pin, puk);
    }
    public void addSzamla(Szamla sz){
        this.szamlak.add(sz);
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s+" egyeneleg: " + this.szamlak;
    }
    
    

    
}
