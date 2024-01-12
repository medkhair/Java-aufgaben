class Ausweis {
  protected int nummer;           // Nummer des Ausweises
  protected String inhaber;       // Inhaber des Ausweises
  protected String ablaufdatum;   // Ablaufdatum des Ausweises
 
  public Ausweis(int nummer, String inhaber, String ablaufdatum) {
    this.nummer = nummer;
    this.inhaber = inhaber;
    this.ablaufdatum = ablaufdatum;
  }
 
  public int getNummer() { return nummer; }
  public String getInhaber() { return inhaber; }
  public String getAblaufdatum() { return ablaufdatum; }
}
 
//--------------------------------------------------
class Identitaetskarte extends Ausweis {
  public int groesse;         // Groesse des Inhabers
  public String buergerort;   // Buergerort des Inhabers
 
  public Identitaetskarte(int nummer, String inhaber,
                          String ablaufdatum, int groesse,
                          String buergerort) {
    super(nummer, inhaber, ablaufdatum);
    this.groesse = groesse;
    this.buergerort = buergerort;
  }
 
  public int getGroesse() { return groesse; }
  public String getBuergerort() { return buergerort; }
}
 
//--------------------------------------------------
class Pass extends Identitaetskarte {
  public String fingerabdruck;   // Digitaler Fingerabdruck
                                 // des Inhabers
 
  public Pass(int nummer, String inhaber, String ablaufdatum,
              int groesse, String buergerort, String fingerabdruck) {
    super(nummer, inhaber, ablaufdatum, groesse, buergerort);
    this.fingerabdruck = fingerabdruck;
  }
 
  public String getFingerabdruck() { return fingerabdruck; }
}
 
//--------------------------------------------------
class Fahrausweis extends Ausweis {
  public String kategorien;   // Fahrzeugkatogerien, die der Inhaber
                              // lenken darf
 
  public Fahrausweis(int nummer, String inhaber, String ablaufdatum,
                     String kategorien) {
    super(nummer, inhaber, ablaufdatum);
    this.kategorien = kategorien;
  }
 
  public String getKategorien() { return kategorien; }
}
class AusweisVerwaltung {
  private Ausweis[] ausweise;
  
  public AusweisVerwaltung() {
    ausweise = new Ausweis[100];
 
    // Erzeugen diverser Ausweise (es ist nur eine Auswahl angegeben)
    ausweise[0] = new Identitaetskarte(1234567, "Max Meier",
                                       "10.05.2010", 178, "Chur"); 
    ausweise[7] = new Pass(76596678, "Eva Mueller", "31.12.2008",
                           169, "Zuerich", "10010110");
    ausweise[16] = new Fahrausweis(5126578, "Ida Fuchs",
                                   "20.03.2015", "A B D1"); 
 
    // Verwendung der von Ihnen zu implementierenden Methoden 
    System.out.println("Total Ausweise: " + countAusweise(ausweise));
    int[] countResult = countAusweisTyp(ausweise);
    System.out.println("Identitaetskarten: " + countResult[0] + 
                       ", Paesse: " + countResult[1] +
                       ", Fahrausweise: " + countResult[2]);
    printPaesse(ausweise);
  }
 
  public static void main(String args[]) { 
    AusweisVerwaltung av = new AusweisVerwaltung();
  }
 
  // Zählt die Anzahl Ausweise im Array ausweise
  public int countAusweise(Ausweis[] ausweise) {
    // Ihre Aufgabe 1)
    return ausweise.length;
  }
 
  // Zählt die Anzahl Ausweise im Array ausweise nach Ausweis-Typ
  public int[] countAusweisTyp(Ausweis[] ausweise) {
    // Ihre Aufgabe 2)
    int s1 = 0;
    int s2 = 0;
    int s3 = 0;
    for (int i=0;i<ausweise.length;i++) {
      if (ausweise[i] instanceof Identitaetskarte) {
        s1++;
      }else if (ausweise[i] instanceof Pass) {
        s2++;
      }else if (ausweise[i] instanceof Fahrausweis) {
        s3++;
      }
    }
    int[] all = {s1, s2, s3};
        return all;
  }
 
  // Gibt die Paesse im Array ausweise auf der Konsole aus
  public void printPaesse(Ausweis[] ausweise) {
    // Ihre Aufgabe 3)
     for (Ausweis ausweis : ausweise) {
        if (ausweis instanceof Pass) {
            Pass pass = (Pass) ausweis;
            System.out.println("Passnummer: " + pass.getNummer() +
                               ", Inhaber: " + pass.getInhaber() +
                               ", Ablaufdatum: " + pass.getAblaufdatum() +
                               ", Größe: " + pass.getGroesse() +
                               ", Bürgerort: " + pass.getBuergerort() +
                               ", Fingerabdruck: " + pass.getFingerabdruck());
        }
    }
  }
}