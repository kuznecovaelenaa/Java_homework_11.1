package ru.netology.domain;

public class FilmManager {
    private PurchaseFilm[] items = new PurchaseFilm[0];

    public void save(PurchaseFilm item) {
        int length = items.length + 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = item;
            items = tmp;
        }
    }

    public PurchaseFilm[] findAll() {
        PurchaseFilm[] result = new PurchaseFilm[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
