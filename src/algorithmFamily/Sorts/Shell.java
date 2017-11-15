package algorithmFamily.Sorts;

import algorithmFamily.Example;

/**
 * 希尔排序。在数据量中等偏大时，优势体现出来。
 * 时间复杂度O（n），空间复杂度O（n），平均时间复杂度O（1）。
 * 不稳定排序
 */
public class Shell extends Example {
    public static void sort(Comparable[] a) {
        int h = 1;
        while (h<a.length/3){
            h = 3*h + 1;
        }
        while (h>=1){
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >=h && less(a[j],a[j-h]) ; j -=h) {
                    exch(a,j,j-h);
                }
            }
            h = h/3;
        }
    }
}
