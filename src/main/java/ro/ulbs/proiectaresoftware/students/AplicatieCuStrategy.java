package ro.ulbs.proiectaresoftware.students;
import java.util.Arrays;
import java.util.List;

public class AplicatieCuStrategy {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10.0)
        );

        Exporter exporter = new Exporter();

        // Test export consola
        exporter.startExport(new StudentiInConsola(), studenti);

        // Test export txt
        String fileText = "studentiStrategyText.txt";
        exporter.startExport(new StudentiInFisierText(fileText), studenti);

        Importer importer = new Importer();

        // Test import txt
        List<Student> cititi = importer.startImport(new StudentiDinFisierText(fileText));
        System.out.println("Am citit " + cititi.size() + " studenti din fisier.");
    }
}