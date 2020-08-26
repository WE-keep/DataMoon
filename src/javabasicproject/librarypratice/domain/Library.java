package javabasicproject.librarypratice.domain;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/25 15:07 星期二
 */
public class Library {

    /**
     * libraryName:图书馆名
     * libraryAddress:图书馆地址
     * libraryPhone:图书馆电话
     * users:借书用户群体
     * admins:管理员群体
     * books:图书馆书籍列表
     * lendBooks：图书馆借出书籍列表
     */
    private String libraryName;
    private String libraryAddress;
    private String libraryPhone;
    private HashMap<String, User> users;
    private HashMap<String, Admin> admins;
    private HashMap<String, Book> books;
    private HashMap<String, Book> lendBooks;

    public HashMap<String, Book> getLendBooks() {
        return lendBooks;
    }

    public void setLendBooks(HashMap<String, Book> lendBooks) {
        this.lendBooks = lendBooks;
    }

    private static Library library = new Library();

    public static Library getLibrary() {
        return library;
    }

    public static void setLibrary(Library library) {
        Library.library = library;
    }

    public Library() {
    }

    public Library(String libraryName, String libraryAddress, String libraryPhone, HashMap<String, User> users, HashMap<String, Admin> admins, HashMap<String, Book> books) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryPhone = libraryPhone;
        this.users = users;
        this.admins = admins;
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public String getLibraryPhone() {
        return libraryPhone;
    }

    public void setLibraryPhone(String libraryPhone) {
        this.libraryPhone = libraryPhone;
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public HashMap<String, Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(HashMap<String, Admin> admins) {
        this.admins = admins;
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", libraryAddress='" + libraryAddress + '\'' +
                ", libraryPhone='" + libraryPhone + '\'' +
                ", users=" + users +
                ", admins=" + admins +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Library)) {
            return false;
        }
        Library library = (Library) o;
        return getLibraryName().equals(library.getLibraryName()) &&
                getLibraryAddress().equals(library.getLibraryAddress()) &&
                getLibraryPhone().equals(library.getLibraryPhone()) &&
                getUsers().equals(library.getUsers()) &&
                getAdmins().equals(library.getAdmins()) &&
                getBooks().equals(library.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLibraryName(), getLibraryAddress(), getLibraryPhone(), getUsers(), getAdmins(), getBooks());
    }
}
