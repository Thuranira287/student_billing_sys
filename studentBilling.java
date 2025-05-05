import java.util.Scanner;
public class studentBilling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input student details
        System.out.print("Enter Student Name: ");
        String StudentName = scanner.nextLine();

        System.out.print("Enter Student Registartion No.: ");
        String StudentRegistartionNo = scanner.nextLine();

        System.out.print("Enter Band(1-5): ");
        int band = scanner.nextInt();

        //Scholarship and Loan amount per band
        int governmentScholarship = 0;
        int studentLoan = 0;

        switch (band) {
            case 1:
            governmentScholarship = 15000;
            studentLoan= 22000;
            break;
            case 2:
            governmentScholarship = 25000;
            studentLoan = 25000;
            break;
            case 3:
            governmentScholarship = 35000;
            studentLoan = 29000;
            break;
            case 4:
            governmentScholarship = 45000;
            studentLoan = 31000;
            break;
            case 5:
            governmentScholarship = 55000;
            studentLoan = 35000;
            break;
            default:
            System.out.println("Invalid Band! Please enter between 1 and 5.");
            return;
        }
        //Constant Total course Fee
        final int totalFee = 90000;
        //calculating fee to be paid by student
        int remainingFee = totalFee - (governmentScholarship + studentLoan);

        //Output
        System.out.println("\n------- Student Details Summary -------");
        System.out.println("Student Name: " + StudentName);
        System.out.println("StudentRegistartion No: " + StudentRegistartionNo);
        System.out.println("Band Placed: " + band);
        System.out.println("Government Scholarship:Ksh " + governmentScholarship);
        System.out.println("Student Loan:Ksh " + studentLoan);
        System.out.println("Total Fee:Ksh " + totalFee);
        System.out.println("Remaining Fee to be paid by the Student:Ksh " + remainingFee);
        System.out.println("\n------- Student Details Summary -------");
        //close scanner
        scanner.close();

    }
}
