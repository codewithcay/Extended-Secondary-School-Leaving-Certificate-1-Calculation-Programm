import java.io.*;
public class PrüfungESek1{
  public static void main(String argv[]) throws IOException{
    //Deklerationen
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int lf1, lf2, lf3, lf4, lf5, lf6,lf7, pol, deu, eng, spo, rel, bbltg, bblpg, buelg;
    double bblt, bblp, buel, durchschnitt, zbuffer, dbuffer, tbuffer, pbuffer, uebuffer;
    String buffer;
    
    //Anwender Info
    System.out.println("Ihr Programm um zu berechnen ob ihre Schüler einen erweiterten Sekundar 1 Abschluss erlangt haben.");
    System.out.println("--------------------------------------------------------------------------------------------------");
    
    //Eingabe
    System.out.println("Bitte geben sie im Folgenden die Noten der/des Schueler*in ein.");
    System.out.println("");
    //Fächer abfrage
    //LF1
    System.out.print("LF1: ");
    buffer = input.readLine();
    lf1 = Integer.parseInt(buffer);
    //LF2
    System.out.print("LF2: ");
    buffer = input.readLine();
    lf2 = Integer.parseInt(buffer);
    //LF3
    System.out.print("LF3: ");
    buffer = input.readLine();
    lf3 = Integer.parseInt(buffer);
    //LF4
    System.out.print("LF4: ");
    buffer = input.readLine();
    lf4 = Integer.parseInt(buffer);
    //LF5
    System.out.print("LF5: ");
    buffer = input.readLine();
    lf5 = Integer.parseInt(buffer);
    //LF6
    System.out.print("LF6: ");
    buffer = input.readLine();
    lf6 = Integer.parseInt(buffer);
    //LF7
    System.out.print("LF7: ");
    buffer = input.readLine();
    lf7 = Integer.parseInt(buffer);
    //DEU
    System.out.print("Deutsch: ");
    buffer = input.readLine();
    deu = Integer.parseInt(buffer);
    //ENG
    System.out.print("Englisch: ");
    buffer = input.readLine();
    eng = Integer.parseInt(buffer);
    //POL
    System.out.print("Politik: ");
    buffer = input.readLine();
    pol = Integer.parseInt(buffer);
    //REL
    System.out.print("Religion: ");
    buffer = input.readLine();
    rel = Integer.parseInt(buffer);
    //SPO
    System.out.print("Sport: ");
    buffer = input.readLine();
    spo = Integer.parseInt(buffer);
    
    
    //Berechnung BBLT
    System.out.println("Der BBLT wird berechnet...");
    bblt = ((lf1*2)+(lf2*2)+(lf4*2)+(lf2*3))/9;
    
    //Berechnung BBLP
    System.out.println("Der BBLP wird berechnet...");
    bblp = ((lf3*4)+(lf5*8)+(lf6*6))/18;
    
    //Berechnung BÜL
    System.out.println("Der BUEL wird berechnet...");
    buel = ((deu*2)+(eng*2)+(pol*2)+(rel*1)+(spo*1))/8;
    
    //Prüfung runden BBLT
    //Berechnung Kommastelle
    tbuffer = bblt;
    zbuffer = bblt-(int)bblt;
    if (zbuffer>=0.5) {
      bblt ++;
      bbltg = (int)bblt;
    }
    else{
      bbltg = (int)bblt;
    }
    
    //Prüfung runden BBLP
    //Berechnung Kommastelle
    pbuffer = bblp;
    zbuffer = bblp-(int)bblp;
    if (zbuffer>=0.5) {
      bblp ++;
      bblpg = (int)bblp;
    } 
    else 
    {
      bblpg = (int)bblp;
    }
    
    //Prüfung runden BÜL
    //Berechnung der Kommastelle
    uebuffer = buel;
    zbuffer = buel-(int)buel;
    if (zbuffer>=0.5) {
      buel ++;
      buelg = (int)buel;
    } else {
      buelg = (int)buel;
    }
    
    //Berechnung gesamt Durchschnitt
    System.out.println("Der gesamt Durchschnitt wird berechnet...");
    durchschnitt = (lf1+lf2+lf3+lf4+lf5+lf6+lf7+deu+eng+pol+rel+spo+bbltg+bblpg+buelg)/15;
    
    //nach 1. Nachkommastelle abschneiden
    dbuffer =durchschnitt*10;
    dbuffer = (int)dbuffer;
    durchschnitt = dbuffer/10;
    
    //Prüfung des erweiterten Sekundar 1 Abschluss
    if ((durchschnitt<=3.0)&&(eng<=3)&&(deu<=3)&&(bbltg<=3)) {
      System.out.println("");
      System.out.println("Der Schüler hat den erweiterten Sekundar 1 Abschluss erworben.");
      System.out.println("--------------------------------------------------------------");
      System.out.println("");
      System.out.println("Der gesamt Durchschnitt ist: "+durchschnitt);
      System.out.println("--------------------------------------------------------------");
      System.out.println("");
      System.out.println("Die Eingegebenen Noten waren:");
      System.out.println("LF1: "+lf1);
      System.out.println("LF2: "+lf2);
      System.out.println("LF3: "+lf3);
      System.out.println("LF4: "+lf4);
      System.out.println("LF5: "+lf5);
      System.out.println("LF6: "+lf6);
      System.out.println("LF7: "+lf7);
      System.out.println("Deutsch: "+deu);
      System.out.println("Englisch: "+eng);
      System.out.println("Politik: "+pol);
      System.out.println("Religion: "+rel);
      System.out.println("Sport: "+spo);
      System.out.println("BBLT: "+bblt);
      System.out.println("");
      System.out.println("--------------------------------------------------------------");
      System.out.println("Die Berechneten Durchschnitte sind: ");
      System.out.println("BBLT: "+bblt);
      System.out.println("Der gerundete BBLT: "+bbltg);
      System.out.println("BBLP: "+bblp);
      System.out.println("Der gerundete BBLP: "+bblpg);
      System.out.println("BUEL: "+buel);
      System.out.println("Der gerundete BUEL: "+buelg);
    }
    else {
      System.out.println("");
      System.out.println("Der Schüler hat den erweiterten Sekundar 1 Abschluss nicht erworben.");
      System.out.println("--------------------------------------------------------------");
      System.out.println("");
      System.out.println("Der gesamt Durchschnitt ist: "+durchschnitt);
      System.out.println("--------------------------------------------------------------");
      System.out.println("");
      System.out.println("Die Eingegebenen Noten waren:");
      System.out.println("LF1: "+lf1);
      System.out.println("LF2: "+lf2);
      System.out.println("LF3: "+lf3);
      System.out.println("LF4: "+lf4);
      System.out.println("LF5: "+lf5);
      System.out.println("LF6: "+lf6);
      System.out.println("LF7: "+lf7);
      System.out.println("Deutsch: "+deu);
      System.out.println("Englisch: "+eng);
      System.out.println("Politik: "+pol);
      System.out.println("Religion: "+rel);
      System.out.println("Sport: "+spo);
      System.out.println("");
      System.out.println("--------------------------------------------------------------");
      System.out.println("Die Berechneten Durchschnitte sind: ");
      System.out.println("BBLT: "+tbuffer);
      System.out.println("Der gerundete BBLT: "+bbltg);
      System.out.println("BBLP: "+pbuffer);
      System.out.println("Der gerundete BBLP: "+bblpg);
      System.out.println("BUEL: "+uebuffer);
      System.out.println("Der gerundete BUEL: "+buelg);
    } 
  }
}
