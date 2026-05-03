import java.util.HashMap;
public class Main_HashMap {
    public static void main(String [] args){
        HashMap<Integer, String> ist = new HashMap<Integer, String>();
        ist.put(1,"Mani");
        ist.put(2,"Chint");
        ist.put(3,"Mani");
        System.out.println(ist);

        for(Integer key: ist.keySet()){
            System.out.println(ist.get(key));
        }


    }
}
