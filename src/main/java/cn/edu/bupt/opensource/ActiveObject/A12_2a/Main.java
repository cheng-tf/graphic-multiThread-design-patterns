package cn.edu.bupt.opensource.ActiveObject.A12_2a;

import cn.edu.bupt.opensource.ActiveObject.A12_2a.activeobject.ActiveObject;
import cn.edu.bupt.opensource.ActiveObject.A12_2a.activeobject.ActiveObjectFactory;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Diana", activeObject).start();
    }
}
