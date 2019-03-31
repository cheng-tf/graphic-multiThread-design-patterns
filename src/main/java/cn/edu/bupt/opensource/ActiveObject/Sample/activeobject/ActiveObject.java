package cn.edu.bupt.opensource.ActiveObject.Sample.activeobject;

public interface ActiveObject {
    public abstract Result<String> makeString(int count, char fillchar);
    public abstract void displayString(String string);
}
