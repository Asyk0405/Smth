// Patient Class typo
class Patient {
    private String name;
    private int age;
    private String ailment;

    // Constructor nu
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

// MedicalProfessional Class
class MedicalProfessional {
    private String name;
    private String specialization;

    // Constructor
    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method to display professional details
    public void displayDetails() {
        System.out.println("Medical Professional Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

// Hospital Class
class Hospital {
    private String name;
    private String location;

    // Constructor
    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to display hospital details
    public void displayDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Location: " + location);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create instances of each class
        Patient patient1 = new Patient("Toilybekov Assylkhan", 45, "Diabetes");
        Patient patient2 = new Patient("Aitimbet Baknur", 30, "Flu");

        MedicalProfessional doctor1 = new MedicalProfessional("Dr. Borat", "Cardiologist");
        MedicalProfessional doctor2 = new MedicalProfessional("Dr. Nursultan", "Pediatrician");

        Hospital hospital = new Hospital("#9 Gorodskaya", "Astana");

        // Display details of the instances
        System.out.println("=== Patient Details ===");
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
    }
}
