package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data

public class FilmManager {
    private PurchaseFilm[] items = new PurchaseFilm[0];
    private int resultLength = 10;

    public FilmManager() {
    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void save(PurchaseFilm item) {
        int length = items.length + 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseFilm[] findAll() {
        return items;
    }

    public PurchaseFilm[] findLast() {
        if (resultLength < items.length) {
            PurchaseFilm[] result = new PurchaseFilm[resultLength];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            PurchaseFilm[] result = new PurchaseFilm[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}
