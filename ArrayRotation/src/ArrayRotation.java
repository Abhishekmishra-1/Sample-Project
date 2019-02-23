import java.util.Scanner;
public class ArrayRotation {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = in.nextInt();
		System.out.println("Enter elements in an array: ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number of rotations: ");
		int noOfRotations = in.nextInt();
		leftRotate(size,arr,noOfRotations);
		rightRotate(size,arr,noOfRotations);
		System.out.println("After rotating the array: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
   public static void leftRotate(int size,int arr[],int noOfRotations)
   {
	   int firstElementIndex = 1;
	   int lastIndex;
	   if(size%2==0)
	   {
		   lastIndex=size-1;
	   }
	   else {
		   lastIndex=size-2;
	   }
	   for(int rotation=1;rotation<=noOfRotations;rotation++)
	   {
		   int temp = arr[firstElementIndex];
		   for(int i=3;i<size;i=i+2)
		   {
			   arr[i-2]=arr[i];
		   }
		   arr[lastIndex]=temp;
	   }
   }
   public static void rightRotate(int size,int arr[],int noOfRotations)
   {
	   int firstElementIndex=0;
	   int lastIndex;
	   if(size%2==1) {
		   lastIndex=size-1;
	   }
	   else {
		   lastIndex=size-2;
	   }
	  for(int rotation=1;rotation<=noOfRotations;rotation++)
	  {
		  int temp = arr[lastIndex];
		  for(int i=(lastIndex-2);i>=0;i=i-2)
		  {
			  arr[i+2]=arr[i];
		  }
		  arr[firstElementIndex]=temp;
	  }
   }
}
