public class Patient implements Comparable<Patient> {
    private String name;
    private String symptoms;
    private Character priority;

    public Patient(String name, String symptoms, Character priority) {
        this.name = name;
        this.symptoms = symptoms;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient p2) {
        int result = 0;
        if (this.priority<p2.priority) {
            result= 1;
        }
        else if (this.priority> p2.priority) {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        String strinToReturn = "Paciente: " + this.name + "\n"+"Sintomas: " + this.symptoms + "\n" + "Prioridad: " + this.priority +"\n";
        return strinToReturn;
    }
}
