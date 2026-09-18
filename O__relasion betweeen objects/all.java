class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void treat(Patient p) {
        System.out.println(name + " treats " + p.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;
    Doctor doctor;

    Hospital(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    void treatment(Patient p) {
        System.out.println("Hospital: " + name);
        doctor.treat(p);
    }
}

public class Main {
    public static void main(String[] args) {

        Doctor d = new Doctor("Dr. Patil");
        Patient p = new Patient("Sangam");

        Hospital h = new Hospital("City Hospital", d);

        h.treatment(p);
    }
}