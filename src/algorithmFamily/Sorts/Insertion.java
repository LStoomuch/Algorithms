package algorithmFamily.Sorts;

import algorithmFamily.Example;

/**
 * 插入排序，适合部分有序的数组
 * 时间复杂度O（n^2），空间复杂度O（1），平均时间复杂度O（n^2）。
 * 稳定排序
 */
public class Insertion extends Example{
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i;j>0&&less(a[j],a[j-1]);j--) {
                exch(a,j,j-1);
            }
        }
    }
}
