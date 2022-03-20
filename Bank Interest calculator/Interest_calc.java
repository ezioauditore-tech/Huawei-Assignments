import java.util.*;
public class Interest_calc {
    public static void main(String[] args)  {
        String b1="SBI";
        String b2 ="Axis";
        System.out.println("Hey User which bank you want to Select: ");
        Scanner sc =  new Scanner(System.in);
        String bank= sc.next();
        if(bank.equalsIgnoreCase(b1)){
            Sbi_Bank sb = new Sbi_Bank();
            sb.show();
        }
        else if(bank.equalsIgnoreCase(b2)){
            Axis_Bank ab = new Axis_Bank();
            ab.show();
        }
        else {
            System.out.println("The Bank is not available");
        }
    }

}
