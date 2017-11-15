package data;

public class DataFactory {
    public static String[] stringArrayFactory(int length) {
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            char c=(char)(int)(Math.random()*26+97);
            strings[i] = String.valueOf(c);
        }
        return strings;
    }

    public static Integer[] intArrayfactory(int length) {
        int range = 100;
        return intArrayfactory(length,range);
    }

    public static Integer[] intArrayfactory(int length,int range) {
        Integer[] ints = new Integer[length];
        for (int i = 0; i < length; i++) {
            ints[i] = (int) (Math.random()*range);
        }
        return ints;
    }
}
