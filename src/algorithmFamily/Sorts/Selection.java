package algorithmFamily.Sorts;

import algorithmFamily.Example;

/**
 * 选择排序。运行时间与输入无关，数据移动是最少的。
 * 时间复杂度O（n^2），空间复杂度O（1），平均时间复杂度O（n^2）。
 * 不稳定排序
 */
public class Selection extends Example {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j<a.length; j++) {
                if (less(a[j],a[min])) min = j;
            }
            exch(a,i,min);
        }
    }
}
