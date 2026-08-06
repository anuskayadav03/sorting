public class insertion {
    public static void main(String[]args){
        int[] arr={9,6,12,8,15,14};
        for(int i=1;i<arr.length;i++){
            int j=i;
         while(j>0&&arr[j-1]>arr[j]){
             int temp=arr[j-1];
             arr[j-1]=arr[j];
             arr[j]=temp;
             j--;
         }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
