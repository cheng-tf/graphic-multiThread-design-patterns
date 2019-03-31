package cn.edu.bupt.opensource.Future.A9_4a;

import java.util.concurrent.ExecutionException;

public interface Data {
    public abstract String getContent() throws ExecutionException;
}
