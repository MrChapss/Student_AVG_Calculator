import java.util.Scanner;
class SGC {
    public static void main(String[] args) {
        // initialize the variables
        Scanner input = new Scanner(System.in);
        int userHowManySub;
        String tryAgain;
        double totalAvg = 0, userGrades;

        // do while to repeat the program if the user input "Yes"
        do {

        // Asking the user how many he/she have
            System.out.printf("%nHow many subject do you have?: ");
            userHowManySub = input.nextInt();
            int[] userHMS = new int [userHowManySub];
        
            // container of the user grades equivalent on how many subject did user put
            for (int i=0; i < userHMS.length; i++) {

            // User will input their grades in this scanner "userGrades"
            System.out.print("Input your grades: ");
            userGrades = input.nextDouble();

            //Computation for getting the average based on the given grades
            totalAvg += userGrades / userHMS.length;
            }
            // output
            System.out.printf("%nThe AVG of your grade/s is : " + totalAvg);

            //reset the value of totalAvg to 0
            totalAvg = 0;

            //asking the user if they want to re-try the program
            while(true){
                System.out.printf("%nDo you want to try again? (Yes/No): ");
                tryAgain = input.next();

                if (!tryAgain.equalsIgnoreCase("Yes") && !tryAgain.equalsIgnoreCase("No")) {
                    System.out.println("Please choose from (Yes/No) only!");
                }
                if (tryAgain.equalsIgnoreCase("No")) {
                    break;
                }
            }
            // if no, it will end the program (since condition will be false == stop)
        } while (!tryAgain.equalsIgnoreCase("No"));
        input.close();
    }
}
