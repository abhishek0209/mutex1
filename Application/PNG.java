package Application;


public class PNG implements Presentable,Printable{
    @Override
    public void present() {
        System.out.println("\nShowing the Image");
    }

    @Override
    public void print() {

    }
    public void doprint(){
        System.out.println("Do print the Png extension images");
    }
}
