package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    PurchaseFilm itsOwnWar = new PurchaseFilm(20220601, 1, "Своя война", 200, 99);
    PurchaseFilm artek = new PurchaseFilm(20220602, 2, "Артек", 100, 105);
    PurchaseFilm escortGirls = new PurchaseFilm(20220603, 3, "Эскортницы", 120, 86);
    PurchaseFilm amanat = new PurchaseFilm(20220604, 4, "Аманат", 210, 120);
    PurchaseFilm vendetta = new PurchaseFilm(20220605, 5, "Вендетта", 150, 96);
    PurchaseFilm wolf = new PurchaseFilm(20220606, 6, "Волк", 300, 99);
    PurchaseFilm manyunya = new PurchaseFilm(20220607, 7, "Манюня", 110, 88);
    PurchaseFilm ghostIsland = new PurchaseFilm(20220608, 8, "Остров призраков", 200, 103);
    PurchaseFilm coati = new PurchaseFilm(20220609, 9, "Коати", 170, 92);
    PurchaseFilm buka = new PurchaseFilm(20220610, 10, "Бука", 160, 98);

    @Test
    void testSave() {
        FilmManager manager = new FilmManager();
        manager.save(itsOwnWar);
        manager.save(artek);
        manager.save(escortGirls);
        manager.save(amanat);
        manager.save(vendetta);
        manager.save(wolf);
        manager.save(manyunya);
        manager.save(ghostIsland);
        manager.save(coati);
        manager.save(buka);

        PurchaseFilm[] actual = manager.findAll();
        PurchaseFilm[] expected = {itsOwnWar, artek, escortGirls, amanat, vendetta, wolf, manyunya, ghostIsland, coati, buka};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSaveLast() {
        FilmManager manager = new FilmManager();
        manager.save(itsOwnWar);
        manager.save(artek);
        manager.save(escortGirls);
        manager.save(amanat);
        manager.save(vendetta);
        manager.save(wolf);
        manager.save(manyunya);
        manager.save(ghostIsland);
        manager.save(coati);
        manager.save(buka);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = {buka, coati, ghostIsland, manyunya, wolf, vendetta, amanat, escortGirls, artek, itsOwnWar};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSaveLastNumber() {
        FilmManager manager = new FilmManager(5);
        manager.save(itsOwnWar);
        manager.save(artek);
        manager.save(escortGirls);
        manager.save(amanat);
        manager.save(vendetta);
        manager.save(wolf);
        manager.save(manyunya);
        manager.save(ghostIsland);
        manager.save(coati);
        manager.save(buka);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = {buka, coati, ghostIsland, manyunya, wolf};
        Assertions.assertArrayEquals(expected, actual);
    }
}