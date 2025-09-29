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
        int userHowManySub;
        String tryAgain;
        double totalAvg = 0, userGrades;

        // adding do while para pwede ulitin yung program unless gusto pa ni user
        do {

        // Asking the user how many he/she have
            System.out.print("How many subject do you have?: ");
            userHowManySub = input.nextInt();
            int[] userHMS = new int [userHowManySub];
        

            for (int i=0; i < userHMS.length; i++) {

            // User will input their grades in this scanner "userGrades"
            System.out.printf("Input your grades: ");
            userGrades = input.nextDouble();

            //Computation for getting the average based on the given grades
            totalAvg += userGrades / (userHMS.length);
            }

            System.out.printf("%nThe AVG of your grades is : " + totalAvg);
            
            System.out.printf("%n%nDo you want to try again? (Yes/No): ");
            tryAgain = input.next();

            // add ako ng if incase na wala sa dalawa yung tinype ni user
            //if 

        } while (tryAgain.equals("No"));
        
        
    input.close();

    }
}