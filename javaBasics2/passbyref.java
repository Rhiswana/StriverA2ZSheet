package Day2;
class number{
    int n;
}
public class passbyref {
    static void change(number a){
      a.n=500;
    }
    public static void main(String[] args) {
        number num=new number();
        num.n=100;
       change(num);
       System.out.println(num.n);
        
    }
}
