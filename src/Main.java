public class Main {
    int modelYear;
    String ModelName;

    public Main(String ModelName){
        this(2020, ModelName);
    }
    public Main(int modelYear, String ModelName){
        this.modelYear=modelYear;
        this.ModelName=ModelName;
    }
    public void printAtt(){
        System.out.println(modelYear+" "+ModelName+" ");
    }
    public static void main(String [] args){
        Main obj1 = new Main("Skoda");
        Main obj2 = new Main(1982, "cheoverletg");

        obj1.printAtt();
        obj2.printAtt();

        obj1.modelYear=1990;
        obj1.printAtt();
    }
}
