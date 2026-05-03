import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileWrite {
    public static void main(String[] args){
        try{
            FileOutputStream opt = new FileOutputStream("C:\\Users\\tamma\\Desktop\\mani.txt");
            opt.write("Hello".getBytes());
            opt.close();
        } catch (IOException e){
            System.out.println("FileNotFound or IOE Excep");
        }


    }
}
