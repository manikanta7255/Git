public class Multiplecatch {

    public static void main (String[] args){
        try{
            int y=10;
            int X[]={1,2,3};
            System.out.print(X[10]);
            int k = X[3]/0;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.print("ArrayIndexOutOfBoundsException");
        }

    }


}
