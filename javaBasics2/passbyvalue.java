package Day2;

public class passbyvalue {
    static void change(int a){
        a=500;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=100;
        change(a);
        System.out.println(a);

    }
    
}
