package jvacodes;

public class Stringduplicate 
{
	public static void main(String[] args) 
	{
		String [] a= {"hello", "hello", "good"};
		for (int i = 0; i < a.length; i++)
		{
		  for (int j = i+1; j < a.length; j++)
		  {
			  if (a[j]==a[i]) 
			  {
				a[j]="bye";
			  }
		  }
			
		}
	 for (int k = 0; k < a.length; k++) 
	 {
		 if (a[k]!="bye") 
		 {
			 System.out.println(a[k]);
		 }
	 }
	}
}
