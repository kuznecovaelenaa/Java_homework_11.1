package ru.netology.domain;

public class PurchaseFilm {
    private int id;
    private int filmId;
    private String filmName;
    private int filmTicketPrice;
    private int duration;


    public PurchaseFilm() {

    }

    public PurchaseFilm(int id, int filmId, String filmName, int filmTicketPrice, int duration) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmTicketPrice = filmTicketPrice;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmTicketPrice() {
        return filmTicketPrice;
    }

    public void setFilmTicketPrice(int filmTicketPrice) {
        this.filmTicketPrice = filmTicketPrice;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
