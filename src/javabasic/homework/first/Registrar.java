package javabasic.homework.first;

import java.io.*;
import java.util.HashMap;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/15 22:20 星期六
 */
public class Registrar implements Registered {
    static {
        HashMap<String, HashMap<String, String>> map = null;

        try {
            //BufferedReader是可以按行读取文件
            FileInputStream inputStream = new FileInputStream("src/javabasic/homework/first/data.txt");
            BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String str = null;
            while((str = bufferedReader.readLine()) != null)
            {
                String[] split = str.split("\\s+");
                HashMap<String, String> temp = new HashMap<>(16);
                temp.put(split[1],split[2]);
                map.put(split[0],temp);
            }
            //close
            inputStream.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String account;
    private String passWord;
    private String phone;
    HashMap<String, HashMap<String, String>> map = null;

    public Registrar() {
    }

    public Registrar(String account, String passWord, String phone) throws IOException {
        this.account = account;
        this.passWord = passWord;
        this.phone = phone;

        if (!isExist() && accountSpecifications() && passWordSpecifications() && phoneWordSpecifications()) {
            HashMap<String, String> temp = new HashMap<String,String>();
            temp.put(this.passWord,this.phone);
            map.put(this.account,temp);

            FileOutputStream fos = new FileOutputStream("src/javabasic/homework/first/data.txt",true);
            String str = account + "\t" + passWord + "\t" + phone + "\n";
            fos.write(str.getBytes());
            fos.close();
        } else if (isExist()) {
            System.out.println("账号已存在");
        } else if (!accountSpecifications()) {
            System.out.println("账号不符合规范");
        } else if(!passWordSpecifications()) {
            System.out.println("密码不符合规范");
        } else if (!phoneWordSpecifications()) {
            System.out.println("手机号不符合规范");
        }

    }



    @Override
    public boolean isExist() {
        return map.containsKey(this.account);
    }

    /**
     * 用户账户验证：必须是6-10位字母、数字、下划线
     * @return account
     */
    @Override
    public boolean accountSpecifications() {
        String regExp = "^[^0-9][\\w_]{5,9}$";
        return this.account.matches(regExp);
    }

    /**
     * 密码正则验证：必须是6-20位的字母、数字、下划线
     * @return true or false
     */
    @Override
    public boolean passWordSpecifications() {
        String regExp = "^[\\w_]{6,20}$";
        return this.passWord.matches(regExp);
    }

    @Override
    public boolean phoneWordSpecifications() {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,1,2,5-9])|(177))\\d{8}$";
        return this.phone.matches(regex);
    }
}
