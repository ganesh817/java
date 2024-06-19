class ArmstrongChecker {
        private int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

       public boolean isArmstrong(int number) {
        int temp = number;
        int count = countDigits(number);
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        
        return number == sum;
    }

        public void printArmstrongNumbers(int limit) {
        for (int x = 1; x <= limit; x++) {
            if (isArmstrong(x)) {
                System.out.println(x + " is an Armstrong number");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArmstrongChecker checker = new ArmstrongChecker();
        checker.printArmstrongNumbers(10000);     }
}
  
