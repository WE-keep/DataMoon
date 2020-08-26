package javabasicproject.librarypratice.service;

import javabasicproject.librarypratice.domain.Admin;
import javabasicproject.librarypratice.domain.Book;
import javabasicproject.librarypratice.domain.Library;
import javabasicproject.librarypratice.domain.User;

import javax.xml.transform.Source;
import java.util.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/25 16:00 星期二
 */
public class LibraryService {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Admin> admins;
    static HashMap<String, User> users;
    static User user;
    static Admin admin;

    //    Library library = Library.getLibrary();
    /*
     *
     * @param library:图书馆参数
     */
    public static void menu(Library library) {

        System.out.println("你好，欢迎来到：" + library.getLibraryName()
                + "\t1.用户登录\r\n\t2.用户注册\r\n\t3.管理员登录\r\n\t4.退出"
                + "\r\n\t请输入以上操作对应的数字进行下一步操作."
        );
        String input = scanner.next();
        switch (input) {
            case "1":
                userLogin();    //ok
                break;
            case "2":
                userRegister();     //ok
                break;
            case "3":
                adminLogin();       // ok
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("输入错误，操作结束。");
        }
    }

    /**
     * 管理员登录
     */
    public static void adminLogin() {
        System.out.println("请输入你的账号\r\n");
        String adminAccount = scanner.next();
        // 定义变量来对输入次数的记录，超过5次直接退出
        // 用户名输入次数
        int adminTimes = 5;
        // 账户密码输入
        int adminPasswordTimes = 5;
        while (adminTimes > 0) {
            // 对账号进行验证
            boolean flag = checkAdminAccount(adminAccount, admins);
            if (flag == true) {
                // 输入密码
                System.out.println("请输入密码");
                while (adminPasswordTimes > 0) {
                    String password = scanner.next();
                    // 对密码进行判断
                    boolean b = checkAdminPassword(adminAccount, password, admins);
                    if (b == true) {
                        admin = admins.get(adminAccount);
                        System.out.println("Login sucessful");
                    } else {
                        System.out.println("你还有" + (--adminPasswordTimes) + "次");
                        System.out.println("请再次输入你的密码");
                        if (adminPasswordTimes == 0) {
                            System.exit(0);
                        }
                    }
                }
            } else {
                // 输入错误，对总次数减1，之后进入下一轮操作
                System.out.println("你还有" + (--adminTimes) + "次");
                System.out.println("请再次输入你的账号");
                adminAccount = scanner.next();
                if (adminTimes == 0) {
                    System.exit(0);
                }
            }
        }
        adminMenu();
    }

    /**
     * 管理员目录
     */
    public static void adminMenu() {
        System.out.println("\t管理员中心\r\n\t" +
                "1.管理员查看所有人借阅信息\r\n\t" +
                "2.管理员查看指定人借阅信息\r\n\t" +
                "3.管理员查看所有未还书籍\r\n\t" +
                "4.管理员查看所有已还书籍\r\n\t" +
                "5.管理员查看所有书籍状态\r\n\t" +
                "6.注册新管理员\r\n\t" +
                "请输入对应的参数进行操作："
        );
        String input = scanner.next();
        switch (input) {
            case "1":
                // 查看所有人借阅信息
                viewAllBorrowMessage();     //ok
                break;
            case "2":
                // 通过账号名获取指定用户的借阅信息
                viewSpecificUserMessageByUserAccount();     // ok
                break;
            case "3":
                // 查看所有未归还的书籍
                viewAllNotReturnedBook();       // ok
                break;
            case "4":
                // 查看所有已归还书籍
                viewAllIsReturnedBook();    // ok
                break;
            case "5":
                // 查看所有书籍状态
                showAllBookStatus();   // ok
                break;
            case "6":
                // 注册新管理员
                registeredNewAdmin();   //ok
                break;
            default:
                System.out.println("错误操作");
                break;
        }
    }

    /**
     * 查看指定人借阅信息
     */
    public static void viewSpecificUserMessageByUserAccount() {
        System.out.println("请输入你要查询用户得到UserId");

        // 对输入的Id进行判断，循环输入没有限制，直到输准确为止。或者使用特定键进行终止
        Boolean flag = true;
        while (flag) {
            String userId = scanner.next();
            if (users.containsKey(userId)) {
                User user = users.get(userId);
                System.out.println(user.toString());
                // 获取未归还书籍
                Map<String, Book> bookMap = user.getBookMap();
                showBook(bookMap);
                // 获取归还书籍
                Map<String, Book> isReturnBooks = user.getIsReturnBooks();
                showBook(isReturnBooks);
                flag = false;
            } else {
                System.out.println("请重新输入");
            }
        }
    }

    /**
     * 管理员查看所有人的借阅信息
     */
    public static void viewAllBorrowMessage() {
        // 获取所有用户的信息
        Set<String> set = users.keySet();
        for (String s : set) {
            // 获取当前用户名为s的对象
            User user = users.get(s);
            // 获取当前用户的借阅书籍(未归还)
            Map<String, Book> bookMap = user.getBookMap();
            // 获取当前用户的已经归还书籍
            Map<String, Book> isReturnBooks = user.getIsReturnBooks();

            System.out.println("已借阅书籍");
            showBook(bookMap);

            System.out.println("历史借阅书籍(已归还)");
            showBook(isReturnBooks);
        }
    }

    public static void showBook(Map<String, Book> bookList) {
        if (bookList.isEmpty() || bookList == null) {
            System.out.println("This is Null or Empty");
        } else {
            Set<String> set = bookList.keySet();
            for (String s : set) {
                System.out.println(bookList.get(s).toString());
            }
        }
    }

    /**
     * 显示所有未归还的书籍
     */
    public static void viewAllNotReturnedBook() {
        Library library = Library.getLibrary();
        // 获取图书馆借出的书籍，也就是未归还的书籍
        HashMap<String, Book> lendBooks = library.getLendBooks();
        System.out.println("\t\t归还书籍");
        showBook(lendBooks);
    }

    public static void viewAllIsReturnedBook() {
        Library library = Library.getLibrary();
        // 获取当前图书馆未借出的书籍，也就是当前书籍，因为总书籍是借出书籍和借出书籍之和
        HashMap<String, Book> books = library.getBooks();
        System.out.println("图书馆未借阅书籍");
        showBook(books);
    }

    public static void showAllBookStatus() {
        Library library = Library.getLibrary();
        // 获取当前图书馆的借出书籍和未借出书籍

        // 未借出书籍
        HashMap<String, Book> books = library.getBooks();
        Set<String> set = books.keySet();
        for (String s : set) {
            System.out.println(books.get(s).getBookName() + "\t未借出");
        }

        // 借出去的书籍
        HashMap<String, Book> lendBooks = library.getLendBooks();
        Set<String> set1 = lendBooks.keySet();

        for (String s : set1) {
            System.out.println(lendBooks.get(s).getBookName() + "\t借出");
        }
    }

    public static void registeredNewAdmin() {
        System.out.println("\t\t注册新管理员");
        System.out.println("请输入账号");
        String adminAccount = scanner.next();
        while (admins.containsKey(adminAccount)) {
            System.out.println("请重新输入，这个账号已经存在");
        }
        System.out.println("请输入密码");
        String adminPassword = scanner.next();

        System.out.println("请输入用户名");
        String adminName = scanner.next();

        System.out.println("请输入创建管理员的级别");
        String adminLevel = scanner.next();

        System.out.println("请输入用户性别");
        String adminSex = scanner.next();

        System.out.println("请输入你的Email");
        String adminEmail = scanner.next();

        System.out.println("请输入你的手机号码");
        String adminPhone = scanner.next();


        Admin newAdmin = new Admin(adminName, adminAccount, adminPassword, adminLevel, adminSex, adminEmail, adminPhone);
        admins.put(admin.getAdminAccount(),admin);

    }

    /**
     * 对管理员密码进行验证
     *
     * @param adminAccount:用户账号
     * @param password：用户密码
     * @param admins：用户列表
     * @return boolean
     */
    public static boolean checkAdminPassword(String adminAccount, String password, HashMap<String, Admin> admins) {
        if (admins.isEmpty()) {
            return false;
        } else {
            // 当使用adminAccount获取得到的对象中的密码和输入的密码进行比较
            return password.equals(admins.get(adminAccount).getAdminPassword());
        }
    }

    /**
     * 对管理员的密码进行验证
     *
     * @param adminAccount:用户账号
     * @param hashMap：用户列表
     * @return boolean
     */
    public static boolean checkAdminAccount(String adminAccount, HashMap<String, Admin> hashMap) {
        if (hashMap.isEmpty()) {
            return false;
        } else {
            // 包含的话就返回true，错误返回false
            return hashMap.containsKey(adminAccount);
        }
    }


    public static boolean checkUserPassword(String userAccount, String password, HashMap<String, User> users) {
        if (users.isEmpty()) {
            return false;
        } else {
            // 当使用adminAccount获取得到的对象中的密码和输入的密码进行比较
            return password.equals(admins.get(userAccount).getAdminPassword());
        }
    }

    public static boolean checkUserAccount(String userAccount, HashMap<String, User> hashMap) {
        if (hashMap.isEmpty()) {
            return false;
        } else {
            // 包含的话就返回true，错误返回false
            return hashMap.containsKey(userAccount);
        }
    }

    /**
     * userAccount:账户
     * userPassword:密码
     * userName:用户名
     * userSex:用户性别
     * userEmail:用户Email
     * userPhoneNumber:用户手机号码
     * bookMap:用户借阅书籍列表
     */
    public static void userRegister() {
        System.out.println("请输入账户：");
        String account = scanner.next();

        System.out.println("请输入密码");
        String password = scanner.next();

        System.out.println("请输入用户名");
        String userName = scanner.next();

        System.out.println("请输入性别");
        String sex = scanner.next();

        System.out.println("请输入你的性别");
        String email = scanner.next();

        System.out.println("请输入用户手机号码");
        String phone = scanner.next();

        HashMap<String, Book> bookMap = new HashMap<String, Book>(16);
        User user = new User(account, password, userName, sex, email, phone, bookMap);
        // 将新建的用户添加进用户列表中
        if (users == null) {
            users = new HashMap<String, User>(16);
            users.put(userName, user);
        }
    }

    public static void userLogin() {
        System.out.println("请输入你的账号\r\n");
        String userAccount = scanner.next();
        // 定义变量来对输入次数的记录，超过5次直接退出
        // 用户名输入次数
        int userTimes = 5;
        // 账户密码输入
        int userPasswordTimes = 5;
        while (userTimes > 0) {
            // 对账号进行验证
            boolean flag = checkUserAccount(userAccount, users);
            if (flag) {
                // 输入密码
                System.out.println("请输入密码");
                while (userPasswordTimes > 0) {
                    String password = scanner.next();
                    // 对密码进行判断
                    boolean b = checkUserPassword(userAccount, password, users);
                    if (b == true) {
                        user = users.get(userAccount);
                        System.out.println("Login sucessful");
                    } else {
                        System.out.println("你还有" + (--userPasswordTimes) + "次");
                        System.out.println("请再次输入你的密码");
                        if (userPasswordTimes == 0) {
                            System.exit(0);
                        }
                    }
                }
            } else {
                // 输入错误，对总次数减1，之后进入下一轮操作
                System.out.println("你还有" + (--userTimes) + "次");
                System.out.println("请再次输入你的账号");
                userAccount = scanner.next();
                if (userTimes == 0) {
                    System.exit(0);
                }
            }
        }
        userMenu();
    }

    public static void userMenu() {
        System.out.println("\t\r\n\t用户目录:" +
                "1.借书\r\n\t" +
                "2.还书\r\n\t" +
                "3.查看个人借阅记录(日志)\r\n\t" +
                "4.查看个人借阅情况(目前未还书籍)\r\n\t" +
                "5.管理员查看\t\r\n" +
                "请输入你要选择的操作(文字前面对应的数字)");
        String input = scanner.next();
        switch (input) {
            case "1":
                // 借书   ok
                borrowBooks(user);
                break;
            case "2":
                // 还书   ok
                returnBook(user);
                break;
            case "3":
                // 查看个人借阅记录(日志) ok
                showPersonBorrowingLog(user);
                break;
            case "4":
                // 查看个人借阅情况(目前未还书籍) ok
                showPersonUnReturnBooks(user);
                break;
            case "5":
                // 管理员查看    ok
                adminView(admin);
                break;
            default:
                System.out.println("输入错误。。。");
                break;
        }
    }

    /**
     * 管理员展示,查看图书馆书籍情况
     * @param admin：使用当前命令的管理员
     */
    public static void adminView(Admin admin) {
        Library library = Library.getLibrary();
        // 获取未还书籍
        HashMap<String, Book> books = library.getBooks();
        // 获取已还书籍
        HashMap<String, Book> lendBooks = library.getLendBooks();
        // 展示这些信息
        System.out.println("\t\t未还书籍");
        showAllBooks(books);
        System.out.println("已还书籍");
        showAllBooks(lendBooks);
    }


    public static void showPersonUnReturnBooks(User user) {
        // 获取当前对象未还书籍
        Map<String, Book> bookMap = user.getBookMap();
        if (bookMap == null || bookMap.isEmpty()) {
            System.out.println("你没有未还的书籍");
        } else {
            Set<String> set = bookMap.keySet();
            System.out.println("你的未还书籍:");
            for (String s : set) {
                System.out.println(bookMap.get(s).toString());
            }
        }
    }

    public static void showPersonBorrowingLog(User user) {
        // 获取自己未还书籍列表
        Map<String, Book> bookMap = user.getBookMap();
        // 获取自己已还书籍列表
        Map<String, Book> isReturnBooks = user.getIsReturnBooks();

        if (bookMap == null || bookMap.isEmpty()) {
            System.out.println("你当前并未借阅任何书籍");
        } else {
            System.out.println("\t\t你的当前借阅书籍。");
            Set<String> set = bookMap.keySet();
            for (String s : set) {
                System.out.println(bookMap.get(s).toString());
            }
        }
        if (isReturnBooks == null || isReturnBooks.isEmpty()) {
            System.out.println("你的借阅历史为空，你从未借阅过书籍");
        } else {
            System.out.println("你的历史借阅书籍(还未归还)");
            Set<String> set = isReturnBooks.keySet();
            for (String s : set) {
                System.out.println(isReturnBooks.get(s).toString());
            }
        }
    }

    public static void returnBook(User user) {
        // 获取当前未还书籍的列表
        Map<String, Book> bookMap = user.getBookMap();
        // 获取当前已还书籍列表
        Map<String, Book> isReturnBooks = user.getIsReturnBooks();

        Library library = Library.getLibrary();
        // 获取图书馆的存在书籍列表
        HashMap<String, Book> books = library.getBooks();
        // 获取图书馆借出书籍列表
        HashMap<String, Book> lendBooks = library.getLendBooks();

        System.out.println("请输入你要归还的书籍ID");
        String bookId = scanner.next();

        // 在自己未还书籍列表中进行查询
        if (bookMap == null) {
            System.out.println("你没有借过书");
        } else {
            // 取出指定ID对应的书籍对象
            Book book = bookMap.get(bookId);
            // 将其加入自己已还书籍
            isReturnBooks.put(bookId,book);
            // 将其放入图书馆书籍列表
            books.put(bookId,book);
            // 将图书馆借书书籍列表中将指定数据删除
            lendBooks.remove(bookId);
            // 在自己未还书单中删除
            bookMap.remove(bookId);
        }


    }

    public static void borrowBooks(User user) {
        Library library = Library.getLibrary();
        HashMap<String, Book> books = library.getBooks();
        showAllBooks(books);
        System.out.println("请输入你要借书籍对应的ID");


        // 判断书籍是否存在
        Boolean flag = true;
        while (flag) {
            Book book = new Book();
            String bookId = scanner.next();
            boolean b = books.containsKey(bookId);
            if (b) {
                Set<String> set = books.keySet();
                for (String s : set) {
                    if (bookId.equals(s)) {
                        book = books.get(s);
                    }
                }
                // 用户书籍列表
                Map<String, Book> bookMap = user.getBookMap();
                bookMap.put(book.getBookId(), book);
                // 再将引用放入图书馆借出书籍列表中
                HashMap<String, Book> lendBooks = library.getLendBooks();
                // 如果还没有初始化
                if (lendBooks == null) {
                    lendBooks = new HashMap<String, Book>(16);
                }
                lendBooks.put(bookId, book);
                flag = false;
            } else {
                System.out.println("你输入的书籍ID不存在，请重新输入");
            }
        }


    }

    public static void showAllBooks(HashMap<String, Book> books) {
        if (books == null) {
            System.out.println("还未存入任何书籍");
        }
        if (books.isEmpty()) {
            System.out.println("该图书馆数据列表为空");
        } else {
            Set<String> set = books.keySet();
            System.out.println("\t\t 所有书籍展示");
            for (String s : set) {
                Book book = books.get(s);
                System.out.println(book.toString());
            }
        }
    }

}
