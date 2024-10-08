
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= new String("Mr   Prashanth  Chinnapelli");
		
		//Coverting String to Array
		String [] str1=s1.split(" ");
		
		//Printing Array value after the conversion from string
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[3]);
		System.out.println(str1[3].trim());
		
		
		//Printing all te charactesrs in the string:
		for (int i=0;i<=s1.length()-1;i++)
		{
			
			System.out.println(s1.charAt(i));
			
		}
		
		//Priting String in reverse order:
		System.out.println("****Reserver***");
		for (int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
	}

}
