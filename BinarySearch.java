import java.util.*;
public class BinarySearch {
public static void main(String[] args) 
{
System.out.print("BINARY SEARCH\n");
Scanner in = new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ELEMENTS:");
int n=in.nextInt();
int[] numbers=new int[n];
System.out.println("ENTER THE INTEGER VALUES:");
for(int i=0;i<n;i++)
{
 if(in.hasNextInt()) 
 numbers[i]=in.nextInt();
 else
 {
 System.out.println("Enter integer numbers only");
 System.exit(0);
   }
        }
System.out.println("ENTER THE KEY VALUE TO BE SEARCHED IN BINARY SEARCH LIST");
int key = in.nextInt();
int res=BinarySearchIterative(numbers,key);
if(res==-1)
System.out.println(key + " IS NOT FOUND");
else
System.out.println(key + " FOUND IN THE ARRAY AT POSITION "+(res+1));
in.close();
}
public static int BinarySearchIterative(int[] A, int data) {
int low = 0, high = A.length-1,mid;
while (low <= high) {
mid = low + (high-low)/2; //To avoid overflow
if(A[mid] == data)
return mid;
else if(A[mid] < data)
low = mid + 1;		
else high = mid - 1;
}
return -1;
}

}
