
public class loop{
    public static void main(String[] args) {
        //for ,while,do while,for each
        for(int i=5;i>=3;i--){
            System.out.println(i);
        }
        int i=13;
        while(i>10){
            System.out.println(i);
            i--;
        }
        int num=5;
        do{

            System.out.println(num);
            num++;
        }while(num>7);
        //for each loop
        int arr[]={1,2,3};
        for(int arrs:arr){
            System.out.println(arrs);
               
        }
    }
}