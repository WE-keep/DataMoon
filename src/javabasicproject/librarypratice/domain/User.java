package javabasicproject.librarypratice.domain;

import java.util.Map;
import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/25 11:50 星期二
 */
public class User extends Person {
    /**
     * userAccount:账户
     * userPassword:密码
     * userName:用户名
     * userSex:用户性别
     * userEmail:用户Email
     * userPhoneNumber:用户手机号码
     * bookMap:用户借阅书籍列表
     */
    private String userAccount;
    private String userPassword;
    private String userName;
    private String userSex;
    private String userEmail;
    private String userPhoneNumber;
    private Map<String, Book> bookMap;
    private Map<String, Book> isReturnBooks;

    public Map<String, Book> getIsReturnBooks() {
        return isReturnBooks;
    }

    public void setIsReturnBooks(Map<String, Book> isReturnBooks) {
        this.isReturnBooks = isReturnBooks;
    }

    public User() {
    }

    public User(String userAccount, String userPassword, String userName, String userSex, String userEmail, String userPhoneNumber, Map<String, Book> bookMap) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSex = userSex;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.bookMap = bookMap;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    @Override
    public String toString() {
        return "User{" +
                "userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", bookMap=" + bookMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return getUserAccount().equals(user.getUserAccount()) &&
                getUserPassword().equals(user.getUserPassword()) &&
                getUserName().equals(user.getUserName()) &&
                getUserSex().equals(user.getUserSex()) &&
                getUserEmail().equals(user.getUserEmail()) &&
                getUserPhoneNumber().equals(user.getUserPhoneNumber()) &&
                getBookMap().equals(user.getBookMap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserAccount(), getUserPassword(), getUserName(), getUserSex(), getUserEmail(), getUserPhoneNumber(), getBookMap());
    }
}
