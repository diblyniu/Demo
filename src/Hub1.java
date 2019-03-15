public class Hub1 {
    public static void main(String[] args) {
        int tmp=0;
        int arr[]={1,3,4,5,2,14,42,21,42};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  tmp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=tmp;
                }
            }
        }
        for (int ab:arr){
            System.out.println(ab);
            System.out.println("我是你爸爸");
        }
    }
}
