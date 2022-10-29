/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Date;

public class Main
{
	public static void main(String[] args) {
		Reader r1 = new Reader("Иванов В.В.", 1, "faculty1", new Date(), "890053555");
		Reader r2 = new Reader("Навальный В.В.", 1, "faculty1", new Date(), "890053555");
		Reader r3 = new Reader("Павлов В.В.", 1, "faculty2", new Date(), "890053555");
		
		Book b1 = new Book("Приключения");
		Book b2 = new Book("Посиделки");
		Book b3 = new Book("Моя борьба");
		Book b4 = new Book("Библия");
		
		ILibrary lib = new Library();
		lib.takeBook(r1, new Book[]{ b1, b2});
		lib.takeBook(r2, new Book[]{b3});
		
		lib.returnBook(r1, new Book[]{b2});
	}
}

 class Book {
    public String name;
    public Book(String name) {
        this.name = name;
    }
}

 class Reader {
    public String fullname;
    public int readerNum;
    public String faculty;
    public Date birthDate;
    public String phone;
        
    public Reader(
        String fullname,
        int readerNum,
        String faculty,
        Date birthDate,
        String phone
    ) {
        this.fullname = fullname;
        this.readerNum = readerNum;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
}

 interface ILibrary {
    public void takeBook(Reader reader, Book[] books);
    public void returnBook(Reader reader, Book[] books);
}


 class Library implements ILibrary {
    public void takeBook(Reader reader, Book[] books) {
        System.out.println(reader.fullname + " взял " + books.length + " книг(и/у)");
    }
    public void returnBook(Reader reader, Book[] books) {
        System.out.println(reader.fullname + " вернул " + books.length + " книг(и/у)");
    }
}




