import java.util.*;
class Equal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("Enter your Family one year income :-");
        //String megana=in.nextLine();
        //in.nextLine();
        int income =in.nextInt();
        //String b=new String("one");
        //String c=b;
        if (income<=7000) {
            System.out.println("Bro You get College Scholarship !!");   
        }else{
            System.out.println("Bro Your RICH people");
        }
    }
}