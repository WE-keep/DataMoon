package javabasic.day11.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 14:44 星期五
 */
public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        //javabasic.day11.demo2.Student@1540e19d

        System.out.println(student.hashCode());
        //356573597

        System.out.println(student.getClass());
        //class javabasic.day11.demo2.Student

        System.out.println(student.getClass().getName());
        //javabasic.day11.demo2.Student

        System.out.println(student.getClass().getName() + "@" + Integer.toHexString(student.hashCode()));

        System.out.println(student.toString());

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.equals(s3));
        //false
        Student s4 = s3;
        System.out.println(s3.equals(s4));
        //true

    }
}

class Student {

}