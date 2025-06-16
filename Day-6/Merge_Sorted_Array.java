public class Merge_Sorted_Array{
    public static void main (String[] args) {
        int[] a={2,5,7,8,12,36,44,45,100};
        int[] b={1,3,4,8,9,11,67,89,96};
        int [] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                c[k]=b[j];
                k++;
                j++;
            }
            else{
                c[k]=a[i];
                i++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
         while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        for(int d=0;d<c.length;d++){
            System.out.print(c[d]+" ");
        }
    }
}
