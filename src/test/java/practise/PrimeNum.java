package practise;

/*
 * ONLY JOB    
 */
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=194;
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
			{
				count++;
			}
			
		}
		System.out.println(count);
		if(count==2) {
			System.out.println(num +" is a prime no ");
		}
		else {
			System.out.println(num +" Not a prime no ");
		}
		PrimeNum number=new PrimeNum();
		System.out.println(number.findPrime(23));
	}

	
	public boolean findPrime(int num) {
	int	count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
			
		}
		return count==2;
		
	}
}
