public class ExamChecker {
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;
        
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    // To avoid printing the same duplicate multiple times if it appears again
                    break; 
                }
            }
            if (foundDuplicate) break;
        }
        
        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}
