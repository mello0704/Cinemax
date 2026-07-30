package cinemax.model;

import java.time.LocalDateTime;

public class Proiezione {

    private Film film;
    private LocalDateTime dataOra;
    private double prezzoBiglietto;

    public Proiezione(Film film, LocalDateTime dataOra, double prezzoBiglietto) {
        this.film = film;
        this.dataOra = dataOra;
        this.prezzoBiglietto = prezzoBiglietto;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public double getPrezzoBiglietto() {
        return prezzoBiglietto;
    }

    public void setPrezzoBiglietto(double prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }

    public static void main(String[] args) {
        Film f = new Film("A Beautiful Mind", "Biography", "Ron Howard", 2001, 135, 12);
        Proiezione p = new Proiezione(f, LocalDateTime.of(2027, 12, 30, 10, 30), 8.50);

        System.out.println("Film: " + p.getFilm().getTitolo());
        System.out.println("Data e ora: " + p.getDataOra());
        System.out.println("Prezzo: " + p.getPrezzoBiglietto());
    }
}