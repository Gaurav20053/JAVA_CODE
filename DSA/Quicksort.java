public class Quicksort {
    public static void quicksort(int arr[],int first,int last){
        if( first < last){
int pidx =partition(arr,first,last);
quicksort(arr,first,pidx-1);
quicksort(arr,pidx+1,last);
        }
    }
    public static int partition(int arr[],int first,int last){
        int pivot =arr[last];//refrence elment we can take any element of array
        int i=first-1;//its to find the no. of space require
        for (int j=first;j<last;j++){
            if(arr[j] <pivot){    //if any elment less then j
                i++;  //then make a place for elment   
                     
                //swap                       //2  5  3  8  9  7
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }   
            i++;   //swap with pivot
            int  temp=arr[i];
             arr[i]= arr[last];
             arr[last]=temp;                
             return i;
             }
    public static void main(String[] args){
int arr[]={0,2,5,38,9,7};
int n=arr.length;
quicksort(arr, 0, n-1);
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
    System.out.println();
}
}
