public class Second {
    private String name = "Mani";

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }
    public static void main(String[] args){
        Second sc = new Second();
        System.out.println(sc.getName());
        sc.setName("Manikanta");
        System.out.println(sc.getName());

    }

}
