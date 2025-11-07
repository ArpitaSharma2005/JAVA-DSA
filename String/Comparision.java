public class Comparision{
    public static void main(String[] args){
        String a = "Arpita";
        String b = "Arptia";
        String c = a;
        // System.out.pringln(c==a)
        // System.out.println(a==b)

        String name1 = new String("Arpita");
        String name2 = new String("Arpita");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}

// == -> compares addresses
// .equals() -> compares content