import java.time.LocalDateTime;
public class DisplayCurrentDate {
    public static void main(String [] args){
        LocalDateTime lc = LocalDateTime.now();
        System.out.println(lc);
    }
}
