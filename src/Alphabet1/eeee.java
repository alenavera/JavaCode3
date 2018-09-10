package Alphabet1;

public class eeee {

		    static int x;
		    StringBuilder sb = new StringBuilder();
		    static StringBuilder sb2 = new StringBuilder();
		    public eeee() {
		      m1();
		      m2();
		    }
		    public void m1(){
		        x += 5;
		        sb.append(x);
		    }
		    public void m2(){
		        x += 10;
		        sb2.append(x);
		    }
		    public static void main(String[] args){
		        eeee t1 = new eeee();
		        eeee t2 = new eeee();
		        eeee t3 = new eeee();
		        String s = t2.sb + "-" + t2.sb2;
		        System.out.println(s);
		      }
		  }

