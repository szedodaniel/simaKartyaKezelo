
package simkartyakezelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terminal{

    private List<Kartya> kartyak = new ArrayList<>();
    private List<String> asd = new ArrayList<>();


    
  //  private String[] adatok;
    public Terminal(String fajlNev){
    try {
            Scanner sc = new Scanner(new File(fajlNev));
            int i = 0;
            while (sc.hasNextLine()){
                String sor = sc.nextLine();
                String[] egysegek = sor.split(";");
              //  String[] adatok = egysegek[0].split(",");
                
                //System.out.println(egysegek[1]);
                
               
                
                //System.out.println(egysegek[0]);
               /* if(adatok[0].charAt(0) == 'F'){
                  
                    // this.kartyak.add(new Feltoltheto(Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),Integer.parseInt(adatok[3]),Integer.parseInt(adatok[4])));
                }else if(adatok[0].charAt(0) == 'E'){
                   // this.kartyak.add(new Elofizeteses(Integer.parseInt(adatok[1]),Integer.parseInt(adatok[2]),Integer.parseInt(adatok[3])));
                }else{
                    System.out.println("Hiba, nincs ilyen kártya");
                }*/
               i++;
            }
            
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Hiba: " + ex);
        }
    }
   
   
    public void bejelentkezes(int kartySorszam, int pin){
        
    }
    public void menu(int kartySorszam){
        
    }
    public void pinValtoztatas(int kartySorszam){
        
    }
    
}
