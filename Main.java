public class Main {
    public static void main(String[] args) {
        System.out.println("creating thread using Runnable Interface :  ");
        // creating user thread
        MyThread t1 = new MyThread(); 
		Thread thread = new Thread(t1);
		thread.start();

        System.out.println("creating thread using Thread class :  ");
		MyThreadImp t2 = new MyThreadImp();
		t2.start();

    }
}
