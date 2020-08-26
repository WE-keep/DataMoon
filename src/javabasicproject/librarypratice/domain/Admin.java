package javabasicproject.librarypratice.domain;

import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/25 14:55 星期二
 */
public class Admin extends Person{
    /**
     * adminName:管理员名
     * adminAccount:管理员账号(唯一不重复)
     * adminPassword:管理员密码
     * adminPermissionLevel:管理员权限等级
     * adminSex:管理员性别
     * adminEmail:管理员Email
     * adminPhoneNumber:管理员手机号码
     */
    private String adminName;
    private String adminAccount;
    private String adminPassword;
    private String adminPermissionLevel;
    private String adminSex;
    private String adminEmail;
    private String adminPhoneNumber;

    public Admin() {
    }

    public Admin(String adminName, String adminAccount, String adminPassword, String adminPermissionLevel, String adminSex, String adminEmail, String adminPhoneNumber) {
        this.adminName = adminName;
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
        this.adminPermissionLevel = adminPermissionLevel;
        this.adminSex = adminSex;
        this.adminEmail = adminEmail;
        this.adminPhoneNumber = adminPhoneNumber;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminPermissionLevel() {
        return adminPermissionLevel;
    }

    public void setAdminPermissionLevel(String adminPermissionLevel) {
        this.adminPermissionLevel = adminPermissionLevel;
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminPermissionLevel='" + adminPermissionLevel + '\'' +
                ", adminSex='" + adminSex + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPhoneNumber='" + adminPhoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Admin)) {
            return false;
        }
        Admin admin = (Admin) o;
        return getAdminName().equals(admin.getAdminName()) &&
                getAdminAccount().equals(admin.getAdminAccount()) &&
                getAdminPassword().equals(admin.getAdminPassword()) &&
                getAdminPermissionLevel().equals(admin.getAdminPermissionLevel()) &&
                getAdminSex().equals(admin.getAdminSex()) &&
                getAdminEmail().equals(admin.getAdminEmail()) &&
                getAdminPhoneNumber().equals(admin.getAdminPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAdminName(), getAdminAccount(), getAdminPassword(), getAdminPermissionLevel(), getAdminSex(), getAdminEmail(), getAdminPhoneNumber());
    }
}
