package cn.edu.bupt.opensource.ActiveObject.Q12_2a;

import cn.edu.bupt.opensource.ActiveObject.A12_2a.activeobject.ActiveObjectFactory;
import cn.edu.bupt.opensource.ActiveObject.A12_2a.activeobject.ActiveObject;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Diana", activeObject).start();
    }
}
