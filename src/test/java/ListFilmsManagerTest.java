import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ListFilmsManagerTest {

    Posters film1 = new Posters("Бладшот.");
    Posters film2 = new Posters("Вперёд");
    Posters film3 = new Posters("Отель Белград");
    Posters film4 = new Posters("Человек-неведимка");
    Posters film5 = new Posters("Тролли.Мировой тур");
    Posters film6 = new Posters("Номер один");
    Posters film7 = new Posters("Для теста");

    @Test
    public void findLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findOneLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findFiveLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }


    @Test
    public void findZeroLast() {
        ListFilmsManager manager = new ListFilmsManager();


        Posters[] actual = manager.findLast();
        Posters[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] actual = manager.findAll();
        Posters[] expected = {film1, film2, film3, film4, film5, film6};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findMoreBySix() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);


        Posters[] actual = manager.findAll();
        Posters[] expected = {film1, film2, film3, film4, film5, film6, film7};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastMoreBySix() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        Posters[] actual = manager.findLast();
        Posters[] expected = {film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }
}