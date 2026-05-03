public class ErrTryCatch {
    public static void main(String[] args){

        //int [][] arr1 = {(1,2),(3,4)};
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");


        }

    }
}
