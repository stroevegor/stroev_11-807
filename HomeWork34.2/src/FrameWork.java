import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.LinkedList;
import java.util.List;

public class FrameWork {
    public static <T> List<T> getObjects(int count, Class<T> aClass, Object ... args) {
        Constructor constructor = isConstructorExisting(aClass, args);
        if (constructor == null) {
            return null;
        } else {
            List<T> list = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                try {
                    list.add((T)constructor.newInstance(args));
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            return list;
        }
    }

    public static Constructor isConstructorExisting(Class aClass, Object ... args) {
        Constructor[] constructor = aClass.getConstructors();
        for (Constructor c :
                constructor) {
            Parameter[] parameters = c.getParameters();
            if (compareParameters(parameters, args)) {
                return c;
            }
        }
        return null;
    }

    public static boolean compareParameters(Parameter[] parameters, Object ... args) {
        if (parameters.length != args.length) {
            return false;
        } else {
            for (int i = 0; i < parameters.length; i++) {
                if (!compareNames(parameters[i].getType().getName(), args[0].getClass().getTypeName())) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean compareNames(String s1, String s2) {
        if (s1.equals(Integer.class.getTypeName()) && s2.equals(int.class.getTypeName()) || s2.equals(Integer.class.getTypeName()) && s1.equals(int.class.getTypeName()) ) {
            return true;
        } else if (s2.equals(Byte.class.getTypeName()) && s1.equals(byte.class.getTypeName()) || s1.equals(Byte.class.getTypeName()) && s2.equals(byte.class.getTypeName())) {
            return true;
        } else if (s2.equals(Short.class.getTypeName()) && s1.equals(Short.class.getTypeName()) || s1.equals(Short.class.getTypeName()) && s2.equals(Short.class.getTypeName())) {
            return true;
        } else if (s2.equals(Character.class.getTypeName()) && s1.equals(char.class.getTypeName()) || s1.equals(Character.class.getTypeName()) && s2.equals(char.class.getTypeName())) {
            return true;
        } else if (s2.equals(Long.class.getTypeName()) && s1.equals(long.class.getTypeName()) || s1.equals(Long.class.getTypeName()) && s2.equals(long.class.getTypeName())) {
            return true;
        } else if (s2.equals(Float.class.getTypeName()) && s1.equals(float.class.getTypeName()) || s1.equals(Float.class.getTypeName()) && s2.equals(float.class.getTypeName())) {
            return true;
        } else if (s2.equals(Double.class.getTypeName()) && s1.equals(double.class.getTypeName()) || s1.equals(Double.class.getTypeName()) && s2.equals(double.class.getTypeName())) {
            return true;
        } else if (s2.equals(Boolean.class.getTypeName()) && s1.equals(boolean.class.getTypeName()) || s1.equals(Boolean.class.getTypeName()) && s2.equals(boolean.class.getTypeName())) {
            return true;
        } else if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
