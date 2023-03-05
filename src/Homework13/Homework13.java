package Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", gogol, 1842);

        Author bulgakov = new Author("Михаил", "Булгаков");
        Book dogsHeart = new Book("Собачье сердце", bulgakov, 1925);

        dogsHeart.setPublishingYear(1920);
        System.out.println(deadSouls);
        System.out.println(deadSouls.equals(dogsHeart));
        System.out.println(gogol.hashCode());
    }
}
