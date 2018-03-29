package Application;


public class PPT implements Presentable,Printable{

    @Override
    public void present() {
        System.out.println("\nPresenting PPT");
    }

    @Override
    public void print() {
        System.out.println("\nPrinting PPT-->"+ip);
    }
}
