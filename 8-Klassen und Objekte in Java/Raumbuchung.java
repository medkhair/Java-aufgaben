class firma{
	String name, adresse;
	int anzahlr, maxr;
	int [] menge;
	boolean [] gebr;
	firma(String n, String a, int maxr){
		this.name = n;
		this.adresse = a;
		this.maxr = maxr;
		this.anzahlr = 0;
        this.menge = new int[maxr];
        this.gebr = new boolean[maxr];
	}

	void fuegeRaumHinzu(int plaetze){
		if (anzahlr < maxr) {
            menge[anzahlr] = plaetze;
            gebr[anzahlr] = false;
            anzahlr++;
        } else {
            System.out.println("Raum konnte nicht hinzugefügt werden.");
        }
    }

	int sucheRaum(int plaetze){
		for (int i = 0; i < anzahlr; i++) {
            if (!gebr[i] && menge[i] >= plaetze) {
                return i + 1;
            }
        }
        return -1;
	}

	int anzahlFrei() {
        int frei = 0;
        for (int i = 0; i < anzahlr; i++) {
            if (!gebr[i]) {
                frei++;
            }
        }
        return frei;
    }
}