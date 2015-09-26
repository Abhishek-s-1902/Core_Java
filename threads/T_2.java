/*
 * Output 
 *	
 */
public class T_2 extends Thread	{
	static int x = 1;
	String info = "";

	public T_2 (String info) {
		this.info = info;
		x++;
		try{
		if(info.equals("a"))
			sleep(1000);
			else{sleep(3000);}
		x++;
		}catch(InterruptedException e ){
			System.out.println("Interupted");
		}
		System.err.println(info + ": exit run");
	}

	public void run () {
		System.out.println(info + ": " + ++x);
	}

	public static void main (String args []) {
		new T_2("a").start();
		new T_2("b").start();
	}
}