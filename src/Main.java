import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> libraryArrayList = new ArrayList<>();

        User firstUser = new User(1,"Greg", 123);

        libraryArrayList.add(new Book("Java1","Robert"));
        libraryArrayList.add(new Book("Java2","Robert2"));
        libraryArrayList.add(new Book("Java3","Robert3"));
        libraryArrayList.add(new Book("Java4","Robert4"));
        libraryArrayList.add(new Book("Java5","Robert5"));

        HashMap<Integer, Book> countOfBookJava1 = new HashMap<>(); // Map для первой книги

        countOfBookJava1.put(1,libraryArrayList.get(0));
        countOfBookJava1.put(2,libraryArrayList.get(0));
        countOfBookJava1.put(3,libraryArrayList.get(0));

        System.out.println(" Колличество книг Java1 " + countOfBookJava1);
        System.out.println();

        HashMap<Integer, Book> countOfBookJava2 = new HashMap<>(); // Map для второй книги

        countOfBookJava2.put(1,libraryArrayList.get(1));
        countOfBookJava2.put(2,libraryArrayList.get(1));
        countOfBookJava2.put(3,libraryArrayList.get(1));

        System.out.println(" Колличество книг Java2 " + countOfBookJava2);
        System.out.println();

        HashMap<Integer, Book> countOfBookJava3 = new HashMap<>(); // Map для третей книги

        countOfBookJava3.put(1,libraryArrayList.get(2));
        countOfBookJava3.put(2,libraryArrayList.get(2));
        countOfBookJava3.put(3,libraryArrayList.get(2));
        countOfBookJava3.put(4,libraryArrayList.get(2));

        System.out.println(" Колличество книг Java3 " + countOfBookJava3);
        System.out.println();

        HashMap<Integer, Book> countOfBookJava4 = new HashMap<>(); // Map для четвёртой книги

        countOfBookJava4.put(1,libraryArrayList.get(3));
        countOfBookJava4.put(2,libraryArrayList.get(3));

        System.out.println(" Колличество книг Java4 " + countOfBookJava4);
        System.out.println();

        HashMap<Integer, Book> countOfBookJava5 = new HashMap<>(); // Map для пятой книги

        countOfBookJava5.put(1,libraryArrayList.get(4));
        countOfBookJava5.put(2,libraryArrayList.get(4));

        System.out.println(" Колличество книг Java5 " + countOfBookJava5);
        System.out.println();

        firstUser.getCatalog().addBook(countOfBookJava1.get(1));
        System.out.println(" Пользователь взял книгу : " + firstUser.getCatalog());
        countOfBookJava1.remove(1);
        System.out.println(" Оставшееся колличество книг Java1 : " + countOfBookJava1.size());
        System.out.println();

        firstUser.getCatalog().getCatalog().remove(0);
        countOfBookJava1.put(1,libraryArrayList.get(0));
        System.out.println(" Пользователь вернул книгу Java1 " + firstUser.getCatalog());
        System.out.println(" Оставшееся колличество книг Java1 : " + countOfBookJava1.size());
        System.out.println();

        /**
         *
         *  ВЫЗОВ С ПОМОШЬЮ USER КАТАЛОК ДЛЯ ИСПОЛЬЗОВАНИЯ МЕТОДА
         *  ПО ДОБАВЛЕНИЮ КНИГИ
         *
         */

        firstUser.getCatalog().addBook(libraryArrayList.get(1));  // Добавяем Java2 в список пользователя
        System.out.println(" Пользователь взял книгу : " + firstUser.getCatalog());

        libraryArrayList.remove(1);  // Удаляем Java2 из списка каталога
        System.out.println(libraryArrayList);

        libraryArrayList.add(firstUser.getCatalog().getCatalog().remove(0)); // Удаляем книгу из списка пользователя и добавляем в список каталога
        System.out.println(" Пользователь вернул книгу " + firstUser.getCatalog());
        System.out.println(libraryArrayList);
        System.out.println();

        firstUser.getCatalog().addBook(libraryArrayList.get(1)); // Добавляем Java3 в список пользователя
        firstUser.getCatalog().addBook(libraryArrayList.get(2)); // Добавляем Java4 в список пользователя
        System.out.println(" Пользователь взял книгу : " + firstUser.getCatalog());

        libraryArrayList.remove(1); // Удаляем Java3 из списка каталога
        libraryArrayList.remove(1); // Удаляем Java4 из списка каталога
        System.out.println(libraryArrayList);

        libraryArrayList.add(firstUser.getCatalog().getCatalog().remove(0)); //Удаляем Java3 из списка пользователя и добавляем в список каталога
        System.out.println(" Пользователь взял книгу : " + firstUser.getCatalog());
        System.out.println(libraryArrayList);
        System.out.println();

        libraryArrayList.add(firstUser.getCatalog().getCatalog().remove(0)); //Удаляем Java4 из списка пользователя и добавляем в список каталога
        System.out.println(" Пользователь вернул книгу " + firstUser.getCatalog());
        System.out.println(libraryArrayList);
    }
}