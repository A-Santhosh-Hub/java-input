import java.util.Scanner;

class TU6 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter The Numbesr 5");
        // String [] ABC= {"A","B","C","D"};
        // String [] name= new String[3];
        // name [1]="SANTHOSH";
        // name[0]="A";
        // name[2]="B";
        // System.out.println(name[1]);
        // System.out.println(ABC[1]);

        int num[]=new int[5];
        num[0]=in.nextInt();
        num[1]=in.nextInt();
        num[2]=in.nextInt();
        num[3]=in.nextInt();
        num[4]=in.nextInt();
        System.out.println("Your Exam Score is: ");
        System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);
    }
}
