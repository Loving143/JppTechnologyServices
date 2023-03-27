import java.util.*;
public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,5,4,6};
		int arr2[]= {3,7,8,9,12,13};
		boolean cv=Arrays.equals(arr1, arr2);
		if(cv)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal ");
		}
		//Aproach 2
		if(arr1.equals(arr2))
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}

	}

}
