import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Stream;

public class mainJCF {
    public static void main(String[] args){
        PriorityQueue<Patient> patientsToSee= new PriorityQueue<Patient>();
        final int[] numberOfPatients = {0};
        try {
            Stream<String> lines = Files.lines(
                    Paths.get("C:\\Users\\HP\\Documents\\GitHub\\HojaDeTrabajo8\\pacientes"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(s ->{
                String[] object = s.split(",");
                Patient toAdd= new Patient(object[0],object[1],object[2].replaceAll("\\s+","").charAt(0));
                patientsToSee.add(toAdd);
                numberOfPatients[0] +=1;


            });
        }catch (IOException exception){
            System.out.println("Error");
        }
        for (int i=0; i<numberOfPatients[0];i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Precione enter para mostrar al sigueinte paciente");
            input.nextLine();
            System.out.println(patientsToSee.remove());
        }

    }
}
