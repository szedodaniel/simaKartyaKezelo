
package simkartyakezelo;


public abstract class Kartya{

    private int szam;
    private int pin;
    private int puk;
    private boolean felold;
    private boolean valtoztat;


    
    public Kartya(int szam, int pin, int puk) {
        this.szam = szam;
        this.pin = pin;
        this.puk = puk;
    }
    
    public boolean feloldas(int pin){
        felold = false;
        if(this.pin == pin){
            this.felold = true;
        }
        return this.felold;
    }

    public boolean valtoztat(int pin, int puk){
        this.valtoztat = false;
        
        if(this.felold == true){
            this.valtoztat = true;
        }
        
        if(valtoztat == true){
            this.setPin(pin);
            this.setPuk(puk);
        }
        return valtoztat;
    }

    public int getPin() {
        return pin;
    }

    public int getPuk() {
        return puk;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setPuk(int puk) {
        this.puk = puk;
    }
    
    

    public int getSzam() {
        return szam;
    }

    @Override
    public String toString() {
        return String.format("Kártya szám %s, pin: %d, puk%d",this.szam,this.pin,this.puk);
    }
    
    
}
