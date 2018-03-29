package Application;


public class Test{
    public static void main(String[] args) {

        PDF resume=new PDF();
        resume.print();

        PPT presentation=new PPT();
        presentation.print();
        presentation.present();

        TXT doc=new TXT();
        doc.print();

        PNG img=new PNG();
        img.present();
        img.print();
        img.doprint();

    }
}
