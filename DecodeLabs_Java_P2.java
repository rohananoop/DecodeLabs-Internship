import java.util.Scanner;

public class DecodeLabs_Java_P2 {
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = Integer.parseInt(sc.nextLine());
        int total=0;
        for(int i=1;i<=n;i++){
            int marks;
            while(true){
                System.out.printf("\nEnter marks for subject %d (out of 100): ",i);
                marks=Integer.parseInt(sc.nextLine());
                if(marks>=0 && marks<=100)
                    break;
                else
                    System.out.printf("Invalid input! Marks must be between 0 and 100. Try again.\n");
            }total+=marks;
        }
        double p=(double)total/n;
        String grade;
        if(p>=90)
            grade="A";
        else if(p>=80)
            grade="B";
        else if(p>=70)
            grade="C";
        else if(p>=60)
            grade="D";
        else if(p>=50)
            grade="E";
        else
            grade="F (FAIL)";
        System.out.println("\n===== RESULT =====");
        System.out.printf("Total Marks: %d\n", total);
        System.out.printf("Average Percentage: %.2f%%\n", p);
        System.out.printf("Grade: %s\n", grade);
        System.out.println("==================");
        sc.close();
    }
}  

