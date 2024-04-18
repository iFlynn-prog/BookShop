import java.util.Scanner;
public class AppMain {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] books = {"Java", "C++", "Kotlin", "Python"};

        System.out.println("Добро пожаловать в книжный магазин");
        System.out.println("Выберите пункт меню:");

        while (true) {
            System.out.println("-------------");
            System.out.println("""
                    Меню:
                    1.Список книг
                    2.Добавить книгу
                    3.Удалить книгу
                    4.Отсортировать книги
                    5.Выход""");
            System.out.print("Ваш выбор ->");
            int printMenu = console.nextInt();

            switch (printMenu) {
                case 1:
                    System.out.println("Список книг");
                    System.out.println("-----------");
                    bookList(books);
                    break;
                case 2:
                    System.out.println("Добавить книгу");
                    System.out.println("--------------");
                    books = addBook(console, books);            //Долбоеб, нужно же перезаписать массив, дохуя часов потратил на это )))
                    break;
                case 3:
                    System.out.println("Удалить книгу");
                    System.out.println("-------------");
                    deleteBook();
                    break;
                case 4:
                    System.out.println("Отсортировать книги");
                    System.out.println("-------------------");
                    sortBook();
                    break;
                case 5:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Выберите меню под пунктом 1-4");
                    break;
            }
        }
    }

    private static String[] addBook(Scanner console, String[] books) {
        System.out.println("Введите название книги:");
        String inputBook = console.next();
        String[] newBooks = new String[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[books.length] = inputBook;
        return newBooks;
    }

    private static void sortBook() {
    }

    private static void deleteBook() {

    }


    private static void bookList(String[] books) {
        System.out.println("Вот все книжки");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }
}

