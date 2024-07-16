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

        Producer_Consumer pc = new Producer_Consumer();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);
        p.start();
        c.start();
    }
}
