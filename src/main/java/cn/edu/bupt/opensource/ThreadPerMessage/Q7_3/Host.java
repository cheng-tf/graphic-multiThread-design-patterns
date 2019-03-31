package cn.edu.bupt.opensource.ThreadPerMessage.Q7_3;

import cn.edu.bupt.opensource.ThreadPerMessage.A7_3.Helper;

public class Host {
    private final Helper helper = new Helper();
    public void request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");
        new Thread() {
            public void run() {
                helper.handle(count, c);
            }
        }.run();
        System.out.println("    request(" + count + ", " + c + ") END");
    }
}
