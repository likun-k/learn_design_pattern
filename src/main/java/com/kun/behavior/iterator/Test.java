package com.kun.behavior.iterator;

public class Test {

    public static void main(String[] args) {
        // new book shelf
        BookShelf bookShelf = new BookShelf();

        //put some books
        bookShelf.appendBook(new Book("Tomcat"));
        bookShelf.appendBook(new Book("Tom and Jerry"));
        bookShelf.appendBook(new Book("Dog "));
        bookShelf.appendBook(new Book("Cat"));
        bookShelf.appendBook(new Book("f"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
