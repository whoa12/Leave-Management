import java.util.Scanner;
public class PracticeProblems2 {


    public class VedCanReachGoal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input values X, Y, and Z
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();

            // Calculate the distances from X to Y and Z
            int distanceXY = Math.abs(Y - X);
            int distanceXZ = Math.abs(Z - X);

            // Check if Ved can reach the goal
            if (distanceXY < distanceXZ) {
                // Ved should go from X to Y directly
                System.out.println(distanceXY);
            } else if (distanceXZ < distanceXY) {
                // Ved should go from X to Z directly
                System.out.println(distanceXZ);
            } else {
                // Ved can reach either Y or Z with the same distance
                System.out.println(distanceXY); // or distanceXZ, as they are equal

            }
        }
    }}