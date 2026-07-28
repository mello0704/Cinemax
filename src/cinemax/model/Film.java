package cinemax.model;

public class Film {

    private String titolo;
    private String genere;
    private String regista;
    private int anno;
    private int durataMinuti;
    private int etaMinima;


public Film(String titolo, String genere, String regista, int anno, int durataMinuti, int etaMinima) {
    this.titolo = titolo;
    this.genere = genere;
    this.regista = regista;
    this.anno = anno;
    this.durataMinuti = durataMinuti;
    this.etaMinima = etaMinima;
}
public String getTitolo() {
    return titolo;
}

public void setTitolo(String titolo) {
    this.titolo = titolo;
}

public String getGenere() {
    return genere;
}

public void setGenere(String genere) {
    this.genere = genere;
}

public String getRegista() {
    return regista;
}

public void setRegista(String regista) {
    this.regista = regista;
}

public int getAnno() {
    return anno;
}

public void setAnno(int anno) {
    this.anno = anno;
}

public int getDurataMinuti() {
    return durataMinuti;
}

public void setDurataMinuti(int durataMinuti) {
    this.durataMinuti = durataMinuti;
}

public int getEtaMinima() {
    return etaMinima;
}

public void setEtaMinima(int etaMinima) {
    this.etaMinima = etaMinima;
}
 

 public static void main(String[] args) {
    Film f = new Film("A Beautiful Mind", "Biography", "Ron Howard", 2001, 135, 12);

    System.out.println("Titolo: " + f.getTitolo());
    System.out.println("Genere: " + f.getGenere());
    System.out.println("Regista: " + f.getRegista());
    System.out.println("Anno: " + f.getAnno());
}
}
