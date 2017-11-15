package test;

import algorithmFamily.Sorts.Shell;
import utils.Print;

public class Test {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s.toCharArray();
        int y = chars.length;
        Character[] chars1 = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars1[i] = chars[--y];
        }
        Print.printArray(chars1);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < chars1.length; i++) {
            s1.append(chars1[i]);
        }
        String s2 = s1.toString();
      TraceInsertion.main(new String[]{s2});
    }
}
