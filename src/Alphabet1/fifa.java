package Alphabet1;

public class fifa {

	
	public String startOz(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		}
public static void main(String[] args) {
	fifa f=new fifa();
	String str = "ozzooon";
	System.out.println(f.startOz(str));
}







}

