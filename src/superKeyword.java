public class superKeyword {
    String type = "mani";
}

class SuperTest extends superKeyword{
    String type = "manikanta";

    public void printt(){
        System.out.println(super.type);
    }
    public static void main(String[] args){
        SuperTest st = new SuperTest();

        st.printt();
        System.out.println(st.type);

    }
}
