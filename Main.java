import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Hospital
        System.out.println("Enter hospital name: ");
        String hospitalName = scanner.nextLine();
        System.out.println("Enter hospital location: ");
        String hospitalLocation = scanner.nextLine();
        Hospital hospital = new Hospital(hospitalName, hospitalLocation);

        // Input for Medical Professionals
        System.out.println("\nEnter details for first medical professional:");
        System.out.println("Name: ");
        String doctor1Name = scanner.nextLine();
        System.out.println("Specialization: ");
        String doctor1Specialization = scanner.nextLine();
        MedicalProfessional doctor1 = new MedicalProfessional(doctor1Name, doctor1Specialization);

        System.out.println("\nEnter details for second medical professional:");
        System.out.println("Name: ");
        String doctor2Name = scanner.nextLine();
        System.out.println("Specialization: ");
        String doctor2Specialization = scanner.nextLine();
        MedicalProfessional doctor2 = new MedicalProfessional(doctor2Name, doctor2Specialization);

        // Input for Patients
        System.out.println("\nEnter details for first patient:");
        System.out.println("Name: ");
        String patient1Name = scanner.nextLine();
        System.out.println("Age: ");
        int patient1Age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Ailment: ");
        String patient1Ailment = scanner.nextLine();
        Patient patient1 = new Patient(patient1Name, patient1Age, patient1Ailment);

        System.out.println("\nEnter details for second patient:");
        System.out.println("Name: ");
        String patient2Name = scanner.nextLine();
        System.out.println("Age: ");
        int patient2Age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Ailment: ");
        String patient2Ailment = scanner.nextLine();
        Patient patient2 = new Patient(patient2Name, patient2Age, patient2Ailment);

        // Display details
        System.out.println("\n=== Patient Details ===");
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();

        System.out.println("\n=== Medical Professional Details ===");
        doctor1.displayDetails();
        System.out.println();
        doctor2.displayDetails();

        System.out.println("\n=== Hospital Details ===");
        hospital.displayDetails();

        // Compare two patients
        System.out.println("\n=== Comparing Patients ===");
        if (patient1.getName().equals(patient2.getName())) {
            System.out.println("Patients have the same name.");
        } else {
            System.out.println("Patients have different names.");
        }

        scanner.close();
    }
}
