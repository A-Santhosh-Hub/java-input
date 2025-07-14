import java.util.*;
class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num = in.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println(num+" This number is Divicibel by 3 and 5");
        }
        if(num%2==0){
            System.out.println(num+" -is EVEN NUMBER");
        }
        else{
            System.out.println("Nothing ");
        }
}
}
