package algorithmFamily.Sorts;

import algorithmFamily.Example;
import data.DataFactory;
import utils.Print;

public class Merge extends Example {
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    public static void sort(Comparable[] a,int low,int hi){
        if (hi <= low) return;
        int mid =low + (hi - low)/2;
        sort(a, low, mid);
        sort(a, mid+1,hi);
        merge(a,low,mid,hi);
    }

    public static void merge(Comparable[] a, int low, int mid, int hi) {
        int i = low, j = mid+1;
        for (int k = low; k<=hi; k++) {
            aux[k] = a[k];
        }
        for (int k = low; k<=hi; k++){
            if (i > mid)                    a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (less(aux[j],aux[i]))   a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }

    }

    public static void main(String[] args) {
        Integer[] integers = DataFactory.intArrayfactory(16,100);
        Print.printArray(integers);
        sort(integers);
        Print.printArray(integers);
    }
}
