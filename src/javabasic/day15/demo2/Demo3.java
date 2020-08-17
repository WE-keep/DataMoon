package javabasic.day15.demo2;

import java.util.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/13 15:23 星期四
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>(16);

        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.getScores() - o2.getScores());
            }
        });
    }
}

class Student {
    private int chinese;
    private int math;
    private int english;
    private int scores;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getChinese() == student.getChinese() &&
                getMath() == student.getMath() &&
                getEnglish() == student.getEnglish() &&
                getScores() == student.getScores();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChinese(), getMath(), getEnglish(), getScores());
    }

    @Override
    public String toString() {
        return "Student{" +
                "chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", scores=" + scores +
                '}';
    }

    public Student() {
    }


    public Student(int chinese, int math, int english) {
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.scores = chinese + math + english;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScores() {
        return chinese + english + math;
    }


}
