package com.practice;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    Boolean isBorrowed=false;
static {
    totalNoOfBooks=0;
}
Book(String  isbn,String title,String author){
    this.isbn =isbn;
    this.title =title;
    this.author = author;
}
Book(String isbn){
    this(isbn ,"unknown","unknown");
}
    static int getTotalNoOfBooks(){
    return totalNoOfBooks;
    }
    void borrowBook(){
    if(isBorrowed){
        System.out.println("Book is already borrowed.");
    }else{
        this.isBorrowed =true;
        System.out.println("Enjoy "+ this.title);
    }
    }
    void returnBook() {
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed,Please leave a review.");
        }else {
            System.out.println("This book is already in the library.");
        }
    }

    public static void main(String[] args) {
        Book myBook = new Book("1","Css","Internet");
        myBook.borrowBook();
        myBook.returnBook();
    }
}
