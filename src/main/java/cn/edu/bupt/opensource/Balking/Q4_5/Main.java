package cn.edu.bupt.opensource.Balking.Q4_5;

public class Main {
    public static void main(String[] args) {
        Thread thread = new cn.edu.bupt.opensource.Balking.Q4.TestThread();
        while (true) {
            thread.start();
        }
    }
}
