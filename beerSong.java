public class beerSong {
    public static void main(String[] args) {
        int bottle = 50;
        String word = "бутылок";

        while (bottle > 0) {
            if (bottle % 10 == 1) {
                word = "бутылка";
            } else if (bottle % 10 == 2) {
                word = "бутылки";
            } else if (bottle % 10 == 3) {
                word = "бутылки";
            } else if (bottle % 10 == 4) {
                word = "бутылки";
            } else {
                word = "бутылок";
            }
            if (bottle == 11) {
                word = "бутылок";
            }
            if (bottle == 12) {
                word = "бутылок";
            }
            if (bottle == 13) {
                word = "бутылок";
            }
            if (bottle == 14) {
                word = "бутылок";
            }
            System.out.println(bottle + " " + word + " пива на столе");
            System.out.println(bottle + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            if (bottle < 1) {
                System.out.println("Нет бутылок пива на столе");
            }
            bottle = bottle - 1;
        }
    }
}
