public class MainTest {

    public static void main(String[] arg){
        inheritanceExamples();
    }

    public static void inheritanceExamples(){
        System.out.println("-------SINGLE INHERITANCE----------");
        Father_Family si = new Father_Family();
        si.display_grandFather();
        si.display_Father();
        System.out.println("--------MULTI INHERITANCE---------");
        Son_Family mi = new Son_Family();
        mi.display_grandFather();
        mi.display_Father();
        mi.display_Son();
        System.out.println("---------HIRARRICAL INHERITANCE--------");
        Young_Father_Family hi1 = new Young_Father_Family();
        hi1.display_grandFather();
        hi1.display_Young_Father();
        Father_Family hi2 = new Father_Family();
        hi2.display_grandFather();
        hi2.display_Father();
    }
}
