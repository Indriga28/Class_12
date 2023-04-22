package Homework_12;

public class Main {

    public static void main(String[] args) {

        Author Leo = new Author ("Leo", "Tolstoy");
        Author Fedor = new Author ("Fedor", "Dostoevsky");
        Book warAndPeace = new Book(1869, Leo, "War and peace");
        Book demons = new Book (1870, Fedor, "Demons");
        demons.setYear(1842);
        System.out.println("Leo.firstName " + Leo.getFirstName() + " Leo.lastName " + Leo.getLastName());
        System.out.println("Fedor.firstName " + Fedor.getFirstName() + " Fedor.lastname " + Fedor.getLastName());
        System.out.println("Книга: " + warAndPeace.getNameOfBook() + ", год " + warAndPeace.getYear() + ", " + warAndPeace.getAuthor());
        System.out.println("Книга: " + demons.getNameOfBook() + ", год " + demons.getYear() + ", " + demons.getAuthor());

    }
}