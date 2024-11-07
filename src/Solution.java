class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int length=0;
          
	   if(word1.length()>word2.length())
		   length=word2.length();
	   else 
		   length=word1.length();
	   
	   for(int i=0;i<length;i++) {
		  result.append(word1.charAt(i));
	   
	   for(int j=i;j<=i;j++) {
		   result.append(word2.charAt(j));
		   
	   }
	   }
	   
		if(word2.length()>word1.length())
				result.append(word2.substring(word1.length(),word2.length()));
		
		else
			result.append(word1.substring(word2.length(),word1.length()));
		
	
        return result.toString();
        
    }
    public static void main(String args[]){
        Solution obj= new Solution();
        String word1="abc";
        String word2 = "pqr";
        System.out.println(obj.mergeAlternately(word1, word2));

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(obj.mergeAlternately(word1, word2));

        word1 = "abcd";
        word2 = "pq";
        System.out.println(obj.mergeAlternately(word1, word2));

     
    }
}
