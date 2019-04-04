public class main {
    public static void main(String[] args){
        //prueba para ver que funcione
        VectorHeap<Patient> patientsToSee = new VectorHeap<Patient>();
        Patient ricardo = new Patient("Ricardo","Pierna rota",'E');
        Patient juan = new Patient("Juan","Tos",'A');
        Patient pedro = new Patient("Pedro","Dolor de brazo",'B');
        patientsToSee.add(juan);
        patientsToSee.add(ricardo);
        patientsToSee.add(pedro);
        System.out.println(patientsToSee.remove());
        System.out.println(patientsToSee.remove());
        System.out.println(patientsToSee.remove());
    }
}
