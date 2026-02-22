package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String -->Int
		//String s = "welcome" ;//cannot convert to int
		//int sint = Integer.parseInt(s);
		
		//Convert String -->Int
		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		//Convert String-->Double
		String s3 = "10.5";
		String s4 = "20.0";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//Convert String--->boolean
		String s ="welcome";//other than true,if you pass any string that will return false
	    System.out.println(Boolean.parseBoolean(s));
	    
	    //int,double,bool,char ------->String
	    
	    int a=10;
	    double b= 109.6;
	    char c ='A';
	    boolean bool =true;
	    
	    System.out.println(String.valueOf(bool));
	    System.out.println(String.valueOf(b));
	    System.out.println(String.valueOf(c));
	    System.out.println(String.valueOf(a));
	    
		
	}

}
