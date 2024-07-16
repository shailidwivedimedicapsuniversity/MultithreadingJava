public class Producer_Consumer {
    int n;
    boolean f = false;
    /// Interthread communication
    // false then producer will chance to produce and consumer will wait
    // true consumer chance
    synchronized public void produce_item(int n) throws Exception{
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("this is producer thread " + this.n);
        f = true;
        notify();
    }

    synchronized public void consume_item() throws Exception{
        if(!f){
            wait();
        }
        System.out.println("this is consumer thread " + this.n);
        f = false;
        notify();
    }

   
}

class Producer extends Thread {
    Producer_Consumer c;

    // constructor
    public Producer(Producer_Consumer c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            i++;
        }
    }
}

class  Consumer extends Thread{
    Producer_Consumer c;

    // constructor
    public Consumer(Producer_Consumer c) {
        this.c = c;
    }

    public void run() {
        
        while (true) {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
           
        }
    }
}