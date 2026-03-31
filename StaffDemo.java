class Staff {
    public void work() {
        System.out.println("Staff is working");
    }
}

class Doctor extends Staff {
    @Override
    public void work() {
        System.out.println("Doctor is treating patients");
    }
}

class Nurse extends Staff {
    @Override
    public void work() {
        System.out.println("Nurse is assisting patients");
    }
}

class Receptionist extends Staff {
    @Override
    public void work() {
        System.out.println("Receptionist is managing appointments");
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Receptionist receptionist = new Receptionist();
        
        System.out.println("--- Staff Work Demonstration ---");
        staff.work();
        doctor.work();
        nurse.work();
        receptionist.work();
        
        System.out.println("\n--- Polymorphism Demonstration ---");
        Staff[] staffMembers = {new Doctor(), new Nurse(), new Receptionist()};
        for (Staff member : staffMembers) {
            member.work();
        }
    }
}
