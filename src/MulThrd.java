public class MulThrd extends Thread
{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        MulThrd td = new MulThrd();
        td.start();
        td.run();

    }
}
