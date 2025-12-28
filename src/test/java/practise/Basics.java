package practise;

/*
 * crt a ststic mthd 
 * crt a non-static mthd 
 * crt a fun vdout arg
 * crt a fun vd arg
 */
public class Basics {

	public static void main(String[] arg) {
		mthd1();
		Basics.mthd1();
		Basics s1=new Basics();
		s1.puji();
		
		s1.mthd2("Pujitha",true);
		s1.mthd3("Beautiful", 0.5f, true);
		s1.mthd4("look", 0.1);
	}
	
	
	
	public static void mthd1() {
	System.out.println("heaven");
}
	
	
	private void puji() {
		System.out.println("hell");

	}
	
	public void mthd2(String life,boolean rainbow ) {
		System.out.println("hy "+ life+" is a "+ rainbow);
		
	}
	
	public void mthd3(String ok,float val1,boolean bln ) {
		System.out.println("ther's a "+ ok +" life for u within a "+ val1 +" years "+ bln);
	}
	
	public void mthd4(String val2,double val3) {
		System.out.println(" pls "+ val2 + " at her now "+ val3 +" X repeat ");
	}
}


