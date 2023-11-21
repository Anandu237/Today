package com.obsqura.assignment;

public class Book {
	int price;
	String bookname;
	Author a;
	public Book(int price, String bookname, Author a) {
		super();
		this.price = price;
		this.bookname = bookname;
		this.a = a;
	}
void display() {
	System.out.println(bookname+";"+price+";"+a.authorName+";"+a.age+";"+a.place);
}
public static void main(String[] args) {
	Author ad= new Author("Anandu",28,"Kollam");
	Book b = new Book(23,"Wings",ad);
			b.display();
}
}
