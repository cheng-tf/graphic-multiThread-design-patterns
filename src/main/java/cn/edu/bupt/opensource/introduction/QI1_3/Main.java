package cn.edu.bupt.opensource.introduction.QI1_3;

public class Main {
    public static void main(String[] args) {
        new PrintThread("*").run();
        new PrintThread("+").run();
    }
}
