import java.util.Scanner;

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 7.5;
    }
}

class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 8.2;
    }
}

class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 7.8;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Bank Interest Rate System ---");
        
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();
        
        System.out.println("\n--- Available Banks and Interest Rates ---");
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        
        System.out.println("\n--- Calculate Interest for Principal Amount ---");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.println("\n--- Interest Calculation Results ---");
        double sbiInterest = principal * sbi.getInterestRate() / 100;
        double hdfcInterest = principal * hdfc.getInterestRate() / 100;
        double iciciInterest = principal * icici.getInterestRate() / 100;
        
        System.out.println("SBI: Principal Rs. " + principal + " -> Interest Rs. " + sbiInterest);
        System.out.println("HDFC: Principal Rs. " + principal + " -> Interest Rs. " + hdfcInterest);
        System.out.println("ICICI: Principal Rs. " + principal + " -> Interest Rs. " + iciciInterest);
        
        System.out.println("\n--- Best Bank for Investment ---");
        if (hdfcInterest > sbiInterest && hdfcInterest > iciciInterest) {
            System.out.println("HDFC offers the highest interest rate: " + hdfc.getInterestRate() + "%");
        } else if (iciciInterest > sbiInterest) {
            System.out.println("ICICI offers the highest interest rate: " + icici.getInterestRate() + "%");
        } else {
            System.out.println("SBI offers the highest interest rate: " + sbi.getInterestRate() + "%");
        }
        
        scanner.close();
    }
}
