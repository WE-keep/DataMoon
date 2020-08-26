package javabasic.myclient.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 20:28 星期六
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String command;
    private String className;

    public User() {
    }

    public User(String username, String password, String command, String className) {
        this.username = username;
        this.password = password;
        this.command = command;
        this.className = className;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", command='" + command + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof User)) {return false;}
        User user = (User) o;
        return getUsername().equals(user.getUsername()) &&
                getPassword().equals(user.getPassword()) &&
                getCommand().equals(user.getCommand()) &&
                getClassName().equals(user.getClassName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getCommand(), getClassName());
    }
}
