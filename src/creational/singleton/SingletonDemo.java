package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println("instance1 hashcode: "+instance1.hashCode());

        LazySingleton reflectionInstance = null;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        LazySingleton deserializedInstance = (LazySingleton) in.readObject();
        in.close();

        System.out.println("deserializedInstance hashcode: "+deserializedInstance.hashCode());

        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        for(Constructor constructor: constructors) {
            constructor.setAccessible(true);
            reflectionInstance = (LazySingleton) constructor.newInstance();
        }

        System.out.println("reflectionInstance hashcode: "+reflectionInstance.hashCode());

        LazySingleton instance2 = (LazySingleton) instance1.clone();
        System.out.println("instance2 hashcode: "+instance2.hashCode());
    }
}
