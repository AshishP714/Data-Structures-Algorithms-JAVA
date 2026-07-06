import java.util.*;

public class Merge TwoSortedArrays {

    public static void main(String[] args) {

        int[] a={1,3,5};
        int[] b={2,4,6};

        int i=0,j=0;

        ArrayList<Integer> ans=new ArrayList<>();

        while(i<a.length && j<b.length){

            if(a[i]<b[j])
                ans.add(a[i++]);
            else
                ans.add(b[j++]);
        }

        while(i<a.length)
            ans.add(a[i++]);

        while(j<b.length)
            ans.add(b[j++]);

        System.out.println(ans);
    }
}