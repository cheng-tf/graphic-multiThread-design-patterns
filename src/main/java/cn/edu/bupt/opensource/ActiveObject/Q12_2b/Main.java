package cn.edu.bupt.opensource.ActiveObject.Q12_2b;

import cn.edu.bupt.opensource.ActiveObject.A12_2b.activeobject.ActiveObject;
import cn.edu.bupt.opensource.ActiveObject.A12_2b.activeobject.ActiveObjectFactory;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        try {
            new AddClientThread("Diana", activeObject).start();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        } finally {
            System.out.println("*** shutdown ***");
            activeObject.shutdown();
        }
    }
}
