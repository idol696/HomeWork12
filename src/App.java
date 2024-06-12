public class App {

    public static void main(String[] args) {

        System.out.println("Задача 1");
        Author authorOne = new Author("Николай","Палыч");
        Author authorTwo = new Author("Педро","Ойдахо");
        Book bookOne = new Book(authorOne, "Уимблдон в Соснах",1999);
        Book bookTwo = new Book(authorTwo, "Восстание Пиначета",1970);
        printBook(bookOne);
        System.out.println("Книга до изменения года:");
        printBook(bookTwo);
        bookTwo.setYear(1971);
        System.out.println("Книга после изменения года:");
        printBook(bookTwo);
    }

    public static void printBook(Book book) {
        System.out.printf("Название книги: %s%nАвтор книги: %s%nГод книги: %s%n----%n",
                book.getName(),book.getAuthor().getFullName(),book.getYear());
    }
}
