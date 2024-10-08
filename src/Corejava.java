import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum=5;
		String mystr="variable test";
		char letter = 'c';
		double dbl = 5.10;
		boolean validation = true;	
		
		System.out.println("integer is"+myNum+"\n"+mystr+letter+dbl+validation);
		//Arrays -- two ways to define arrays
		int arr1[]= new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=31;
		arr1[3]=40;
		arr1[4]=50;
		
		int[] arr2= {11,22,33,44,55};
		System.out.println(arr1[1]+"       "+arr2[1]);
	
		String names[] = {"nissy","blessy","jessy"};
	//For Loop 	
		for (int i=0;i<arr1.length;i++)
		{
			//printing even numbers
			if (arr1[i]%2 == 0 )
					{
				System.out.println("even number loop");
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
			//use break; to come of of the loop if the if condition is satisfied
					}
			else 
			{
				System.out.println("Odd number loop");
				System.out.println(arr1[i]);
			}
				
		}
		
		//Enhanced for Loop for integer array
		for (int j: arr1)
		{
			System.out.println("\n enhanced for loop for integer array");
			System.out.println(j);
			
			
		}
		
		//Enhanced for Loop for String array
		for (String s1 : names )
		{
			System.out.println("\n enhanced for loop for string array");
			System.out.println(s1);
		}
		
		ArrayList<String> arlst =new ArrayList<String>();
		arlst.add("Prashanth");
		arlst.add("Chinnapelli");
		arlst.addFirst("Mr");
		arlst.add(1, "&");
		arlst.remove(1);
		
		//prints all the elements in array:
		System.out.println("ArrayList"+arlst);
		
		//printing specific value in array list:
		System.out.println(arlst.get(1));
		
		//for loop for printing all the values in the array list:
				for (int k=0; k<arlst.size();k++)
		{
			System.out.println("arralist value"+arlst.get(k));
		}
		
		//Ehhanced forloop for the arraylist:
				for(String str2:arlst)
				{
					System.out.println("arralist value********"+str2);
					
				}
			//Searching for value is arraylist	
		System.out.println(arlst.contains("Prashanth"));
		
		//Converting Static array to Array List using Arrays.AsList() which retruns List
	    List<String> arlst2	=Arrays.asList(names);
	    
	    //Prining the new Arraylist after conversion from static array list:\
	    System.out.println("ArrayList2 after convreions ***"+arlst2);
	    System.out.println(arlst2.contains("nissy"));
	
		
	}

}
