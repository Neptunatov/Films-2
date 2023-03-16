public class Main {
    public static void main(String[] args) {

        Posters film1 = new Posters("Бладшот.");
        Posters film2 = new Posters( "Вперёд");
        Posters film3 = new Posters( "Отель Белград");
        Posters film4 = new Posters("Человек-неведимка");
        Posters film5 = new Posters( "Тролли.Мировой тур");
        Posters film6 = new Posters("Номер один");


        ListFilmsManager manager = new ListFilmsManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] all = manager.findLast();
    }
}
