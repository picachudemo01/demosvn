import java.lang.Thread;
class Hello extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("New thread");
		}
	}
	public static void Xuat(){
		System.out.print("Su thay doi mot");
	}
	public static void main(String[] as){
		Hello tt=new Hello();
		tt.start();
		for(int i=0;i<10;i++){
			System.out.println("Main thread");
		}/*dddd*/
	}}