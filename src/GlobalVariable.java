class GlobalVariable
{
	public static void main(String args[])
	{
	   String s2= new String("abc");
	   String s1= new String("defghi");
	   int length=0;
	   if(s1.length()>s2.length())
		   length=s2.length();
	   else 
		   length=s1.length();
	   
	   for(int i=0;i<length;i++) {
		  System.out.print(s1.charAt(i));
	   
	   for(int j=i;j<=i;j++) {
		   System.out.print(s2.charAt(j));
		   
	   }
	   }
	   
		if(s2.length()>s1.length())
				System.out.print(s2.substring(s1.length(),s2.length()));
		
		else
			System.out.print(s1.substring(s2.length(),s1.length()));
		
	}

	
}