package javabasicproject.librarypratice.domain;

import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/25 11:29 星期二
 */

public class Book {
    /**
     * bookId:图书版本号
     * bookName:书籍名称
     * bookPrice:书籍价格
     * bookAuthor:书籍作者
     */
    private String bookId;
    private String bookName;
    private double bookPrice;
    private String bookAuthor;

    public Book() {
    }

    public Book(String bookId, String bookName, double bookPrice, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Double.compare(book.getBookPrice(), getBookPrice()) == 0 &&
                getBookId().equals(book.getBookId()) &&
                getBookName().equals(book.getBookName()) &&
                getBookAuthor().equals(book.getBookAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getBookName(), getBookPrice(), getBookAuthor());
    }
}
