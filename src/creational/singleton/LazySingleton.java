package creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Cloneable, Serializable {

    public static LazySingleton instance;

    //prevent breaking using reflection
    private LazySingleton() {
        if(instance != null) {
            throw new IllegalStateException("Object cannot be created using Reflection");
        }
    }

    //prevent breaking using cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //prevent from deserialization
    protected Object readResolve() {
        return instance;
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
