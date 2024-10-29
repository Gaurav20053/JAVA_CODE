public class Mergesort {
    public static void conquer(int start,int end,int mid,int arr[]){
int merger[]=new int[end-start+1];
int idx1=start;
int idx2=mid+1;
int x=0;
while(idx1<=mid && idx2<=end){
    if(arr[idx1]<=arr[idx2]){
        merger[x]=arr[idx1];
        x++;idx1++;          //it can also be writn as merger[x++]=arr[idx1++]; which decrease the code by one sentence
    }else{
        merger[x++]=arr[idx2++];
   } }while(idx1<=mid){
        merger[x++]=arr[idx1++];
    }while(idx2<=end){
        merger[x++]=arr[idx2++];
    }
    for(int i=0,j=start;i<merger.length;i++,j++){
        arr[j]=merger[i];
    }

    }public static void divide(int start,int end,int arr[]){
        if(start>=end){
            return;
        }
        int mid =start + (end - start)/2;
        divide(start,mid,arr);
        divide(mid+1,end,arr);
        conquer(start,end,mid,arr);
    }
    public static void main(String args[]){
        int arr[]={3,22,44,55,34,00,99};
        int n=arr.length;
        divide (0 , n-1 , arr );
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }
}