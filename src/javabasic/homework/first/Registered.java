package javabasic.homework.first;

/**
 * @author DataMoon
 */
public interface Registered {
    /**
     * 判断账号是否存在
     * @return
     */
    public boolean isExist();

    /**
     * 账号是否符合规范，长度和正则
     * @return
     */
    public boolean accountSpecifications();

    /**
     * 密码验证
     * @return true or false
     */
    public boolean passWordSpecifications();

    /**
     * 电话号码验证
     * @return true or false
     */
    public boolean phoneWordSpecifications();
}
