public class ThreadOperations {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        Thread t = Thread.currentThread() ;
        System.out.println(t.getName());
        Thread.sleep(1000); // sleep method throws exeption InterruptedException so use throws in method declaration or surrounded with try catch block
        t.setName("shaili thread"); 
        System.out.println(t.getName());
        System.out.println(t.getId());

        // going to start user defined thread from MyThreadImp class
        MyThreadImp t1 = new MyThreadImp();
        t1.start();
    }
}
