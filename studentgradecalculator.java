import java.util.*;
import java.lang.*;

public class studentgradecalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter marks of Sub"+(i+1)+"(for 100):");
            int m=sc.nextInt();
            sum=sum+m;
        }
        double s=sum;
        double avg=s/n;
        char g=(avg>90.0)?'A':(avg>80.0)?'B':(avg>60.0)?'C':(avg>40.0)?'D':'F';
        System.out.println("TOTAL MARKS="+sum+"/"+(n*100)+ "\n AVG PERCENTAGE="+avg+"%"+"\n GRADE:"+g);
    }

}
