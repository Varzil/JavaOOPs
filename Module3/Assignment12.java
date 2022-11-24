package Module3;

class ThreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        } catch (Exception e) {System.out.println("Threading exception");}
    }
}
public class Assignment12 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            ThreadingDemo t = new ThreadingDemo();
            t.start();
        }
    }
}
