import java.util.Scanner;
/*
 * Create a student grade calculator (using loop and arrays)
 * 1. Bawal AI
 * 2. Use return statement for returning value
 * 3. Complete the project with no bugs/error
 * 4. Additional feature
 * 
 */
class SGC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userHowManySub, userGrades;
        String tryAgain;
        double totalAvg = 0;

        do {

        // Asking the user how many he/she have
            System.out.print("How many subject do you have?: ");
            userHowManySub = input.nextInt();
            int[] userHMS = new int [userHowManySub];
        

            for (int i=0; i < userHMS.length; i++) {

            // User will input their grades in this scanner "userGrades"
            System.out.print("Input your grades: ");
            userGrades = input.nextInt();

            //Computation for getting the average based on the given grades
            totalAvg += userGrades / userHMS.length;
            }
            
            System.out.println("The AVG of your grades is : " + totalAvg);
            
            System.out.println("Do you want to try again? (Yes/No): ");
            tryAgain = input.next();

        } while (tryAgain != "Yes");
        
        
        
    input.close();

    }
}