abstract class ClassAbstract {
    public abstract void mthd();
    public void Mthd1(){
        System.out.println("mthd1");
    }
}
class Ksdrdd extends ClassAbstract{
    public void mthd(){
        System.out.println("Abs print");
    }
    public static void main(String[] args){
        Ksdrdd kk = new Ksdrdd();
        kk.mthd();
        kk.Mthd1();
    }
}
