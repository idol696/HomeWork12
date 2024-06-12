public class App {

    public static void main(String[] args) {

        Author authorOne = new Author("Николай","Палыч");
        Author authorTwo = new Author("Педро","Ойдахо");
        Book bookOne = new Book(authorOne, "Уимблдон в Соснах",1999);
        Book bookTwo = new Book(authorTwo, "Восстание Пиначета",1970);
        bookTwo.setYear(1971);
        System.out.print("Название:" + bookOne.getName());
        System.out.print(" Автор Книга 1: " + bookOne.getAuthor().getFullName());
        System.out.println(" год:" + bookOne.getYear());
        System.out.print("Название:" + bookTwo.getName());
        System.out.print(" Автор Книга 2: " + bookTwo.getAuthor().getFullName());
        System.out.println(" год:" + bookTwo.getYear());
    }
}
