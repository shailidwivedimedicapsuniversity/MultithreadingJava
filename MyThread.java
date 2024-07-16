// creating thread using runnable interface, only blueprint
public class MyThread implements  Runnable{
    @Override
    public void run() {
        // in run method we write main task
        for(int i=0; i<10; i++){
            System.out.print(i+ " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
