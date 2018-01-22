package chapter02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by muzi on 2018/1/15.
 */
public class Test {

    public static void main(String[] args) {
        String formatStr = "this %s time at %s tom";
        try {
            Class c = Class.forName("java.lang.String");
            Method method = c.getMethod("format", String.class, Object[].class);
            Object[] objects = {"muzi", "hello"};
            Object o = method.invoke(null, formatStr, objects);
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
