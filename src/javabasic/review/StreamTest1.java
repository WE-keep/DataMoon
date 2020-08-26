package javabasic.review;

import java.io.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/21 20:21 星期五
 */
public class StreamTest1 {
    public static void main(String[] args) throws Exception {
        /*FileOutputStream fos = null;

        File file;
        try {
            fos = new FileOutputStream("D:\\bigdata\\src\\javabasic\\review\\test");

            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.write("你好，春夏".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }*/

/*       try (FileOutputStream fos2 = new FileOutputStream("D:\\\\bigdata\\\\src\\\\javabasic\\\\review\\\\test",true);
       ){
            fos2.write("shgrh超市\n".getBytes());
            fos2.write("shgrh超市\n".getBytes());
            fos2.write("shgrh超市".getBytes());
       } catch (Exception e) {
           e.printStackTrace();
       }*/


        // 对文件的读操作
        /*try (FileInputStream fis = new FileInputStream("D:\\bigdata\\src\\javabasic\\review\\test");){
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = fis.read(bys)) != -1) {
                System.out.println(new String(bys));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

//        copyFile("D:\\bigdata\\src\\javabasic\\review\\test","D:\\bigdata\\src\\javabasic\\review\\test2.md");

//        bufferedCopyFile("D:\\bigdata\\src\\javabasic\\review\\test","D:\\bigdata\\src\\javabasic\\review\\test3.md");
//        File file = new File("D:\\bigdata\\src\\javabasic\\review\\test2.md");
//        File file1 = new File("D:\\bigdata\\src\\javabasic\\review\\test3.md");
//        file.delete();
//        file1.delete();

        Person person = new Person("陈焕堂", 23, "男");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\bigdata\\src\\javabasic\\review\\test"));
        oos.writeObject(person);
    }

    /**
     * 使用普通I/O流复制一个文件到新文件
     * @param oldFile   目标文件
     * @param newFile   要复制的新文件
     * @throws Exception    目标文件不存在的时候报错
     */
    public static void copyFile(String oldFile, String newFile) throws Exception {
        File file1 = new File(oldFile);
        File file2 = new File(newFile);
        new File(newFile);
        if (!file1.exists()) {
            throw new Exception(oldFile + "is notfound");
        }
        // 先判断要写入的那个文件在不在，不在的话就创建一个
        if (!file2.exists()) {
            file2.createNewFile();
        }


        try (
                // 创建输入流和输出流
                FileInputStream fis = new FileInputStream(file1);
                FileOutputStream fos = new FileOutputStream(file2,true);
                ){

            //创建数组并定义长度
            int len = 0;
            byte[] bytes = new byte[1024];

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 使用BufferedStream对数据进行读写
     * @param targetFile
     * @param destFile
     * @throws Exception
     */
    public static void bufferedCopyFile(String targetFile,String destFile) throws Exception {
        // 创建file对象，并对目标文件进行判断
        File target = new File(targetFile);
        File dest = new File(destFile);

        if (!target.exists()) {
            throw new Exception(targetFile + "cannot found");
        }
        try (
                // 创建输入输出流
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(target));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
                ){
            int len = 0;
            byte[] bytes = new byte[1024];

            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
                bos.flush();
            }
        }

    }

    /**
     * 使用BufferefRead进行读，BufferefWrite进行写实现复制代码
     * @param targetFile
     * @param destFile
     * @throws Exception
     */
    public static void bufferedReadWriterCopyFile(String targetFile,String destFile) throws Exception {
        File target = new File(targetFile);
        File dest = new File(destFile);

        if (!target.exists()) {
            throw new Exception(targetFile + "can not found");
        }


        try (
                BufferedReader br = new BufferedReader(new FileReader(target));
                BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
                ){
            String s = null;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.flush();
            }
        }
    }


}
class Person implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;
    String sex;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}