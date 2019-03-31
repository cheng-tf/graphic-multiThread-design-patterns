package cn.edu.bupt.opensource.ActiveObject.jucSample.activeobject;

public class ActiveObjectFactory {
    public static ActiveObject createActiveObject() {
        return new ActiveObjectImpl();
    }
}
