abstract class Ticket {
  private int preis;  // Der Preis
  private boolean entwertet;  // Ungültig, wenn entwertet!
 
  public Ticket( int preis ) {
    this.preis = preis;
    entwertet = false;
  }
 
  public int getPreis() { return preis; }
  public void entwerten() { entwertet = true; }
  public boolean istEntwertet() { return entwertet; }
  public abstract boolean gueltigInZone( int zone );
}
 
//--------------------------------------------------
class Einzelticket extends Ticket {
  private int zone;  // Nur in dieser Zone gültig!
  private String verfallsDatum;  // String im Format JJJJMMTT
                                 // Nach diesem Datum ungültig!
 
  public Einzelticket(int preis, String verfallsDatum, int zone) {
    super(preis);
    this.verfallsDatum = verfallsDatum;
    this.zone = zone; 
  }
 
  public String getVerfallsDatum() { return verfallsDatum; }
  public boolean gueltigInZone(int zone) { return zone == this.zone; }
}
 
//--------------------------------------------------
class Mehrfahrtenkarte extends Ticket {
  private int fahrten;  // Anzahl erlaubte Fahrten
  private int zone;  // Nur in dieser Zone gültig!
 
  public Mehrfahrtenkarte(int preis, int fahrten, int zone) {
    super(preis);
    this.fahrten = fahrten;
    this.zone = zone;
  }
 
  public void entwerten() {
    if( fahrten == 0 ) return;
    fahrten -= 1;
  }
 
  public boolean istEntwertet() { return fahrten == 0; }
  public boolean gueltigInZone( int zone ) { return zone == this.zone; }
}
 
//--------------------------------------------------
class Generalabo extends Ticket {
  private String inhaber;  // Nur für diese Person gültig!
  private String verfallsDatum;  // String im Format JJJMMTT
                                 // Nach diesem Datum ungültig!
 
  public Generalabo(int preis, String inhaber, String verfallsDatum) {
    super(preis);
    this.inhaber = inhaber;
    this.verfallsDatum = verfallsDatum; 
  }
 
  public void entwerten() { /* es passiert nix! */ }
  public String getVerfallsDatum() { return verfallsDatum; }
  public boolean gueltigInZone( int zone ) { return true; }
  public String gibInhaber() { return inhaber; }

  public int kontrolliere( String[] namen, Ticket[] tickets, int zone, String datum ) {
    int schwarzFahrer = 0;
 
    if( namen.length != tickets.length )
      throw new IllegalArgumentException();
    for (int i = 0; i < namen.length; i++) {
    Ticket ticket = tickets[i];
    System.out.println("Kontrolle für " + namen[i] + ":");
    
    // Entwerten alle Tickets
    ticket.entwerten();

    // Überprüfen auf Gültigkeit
    if (!ticket.istEntwertet()) {
      // Einzelticket: Gültig nur in bestimmter Zone und vor Verfallsdatum
      if (ticket instanceof Einzelticket) {
        Einzelticket einzelticket = (Einzelticket) ticket;
        if (!einzelticket.gueltigInZone(zone) || datum.compareTo(einzelticket.getVerfallsDatum()) > 0) {
          schwarzFahrer++;
          System.out.println("Schwarzfahrer!");
        } else {
          System.out.println("Gültig in Zone.");
        }
      }
      // Mehrfahrtenkarte: Gültig nur in bestimmter Zone und solange noch Fahrten verfügbar
      else if (ticket instanceof Mehrfahrtenkarte) {
        Mehrfahrtenkarte mehrfahrtenkarte = (Mehrfahrtenkarte) ticket;
        if (!mehrfahrtenkarte.gueltigInZone(zone) || mehrfahrtenkarte.istEntwertet()) {
          schwarzFahrer++;
          System.out.println("Schwarzfahrer!");
        } else {
          System.out.println("Gültig in Zone. Verbleibende Fahrten: " + mehrfahrtenkarte.istEntwertet());
        }
      }
      // Generalabo: Immer gültig
      else if (ticket instanceof Generalabo) {
        Generalabo generalabo = (Generalabo) ticket;
        System.out.println("Gültig im gesamten Netz für Inhaber: " + generalabo.gibInhaber());
      }
    } else {
      schwarzFahrer++;
      System.out.println("Schwarzfahrer!");
    }

    System.out.println("------------------");
  }
  return schwarzFahrer;
  }
    // MEIN CODE HIER!

  
}
