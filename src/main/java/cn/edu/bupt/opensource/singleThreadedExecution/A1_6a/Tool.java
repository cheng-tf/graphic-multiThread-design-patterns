package cn.edu.bupt.opensource.singleThreadedExecution.A1_6a;

public class Tool {

    private final String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + name + " ]";
    }
}
