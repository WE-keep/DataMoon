package javabasic.day09.Demo6;

public class Demo2 {
    public static void main(String[] args) {
        PrintLetter printLetter = new PrintDemo();
        printLetter.printLowerLetter();
        printLetter.printUpperLetter();
    }
}

interface PrintLetter {
    void printLowerLetter();
    void printUpperLetter();
}

class PrintDemo implements PrintLetter {

    @Override
    public void printLowerLetter() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    @Override
    public void printUpperLetter() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
