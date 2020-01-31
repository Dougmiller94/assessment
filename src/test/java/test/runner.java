package test;

public class runner {
	
	public static void main(String[] args) {
		
		String str = "The";
		
		
		int index1 = str.charAt(0); 
		int index2 = str.charAt(1);
		
		System.out.println((char)index1);
	}
		
		public class StringManipulation {
			String str = "Hello!";
			StringBuffer buffer = new StringBuffer(str.length()) {
			for (int i = str.length() - 1; i >= 0; i--) {
			buffer.append(str.charAt(i));
			}
			String reversedStr = buffer.toString();
			System.out.println("The reverse of the string \""
			+ str + "\" is \"" + reversedStr + "\".");
			}
		
			
			
		
	    

