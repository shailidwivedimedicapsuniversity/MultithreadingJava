public class MyThreadImp extends Thread{
    @Override
    public void run() {
        for(int i=10; i<20; i++){
            System.out.print(i+ " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
