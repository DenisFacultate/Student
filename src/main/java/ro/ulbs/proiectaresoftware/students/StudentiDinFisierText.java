package ro.ulbs.proiectaresoftware.students;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiDinFisierText implements IStudentiImport {
    private String fileName;

    public StudentiDinFisierText(String fileName) { this.fileName = fileName; }

    @Override
    public List<Student> doImport() {
        List<Student> lista = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] date = scanner.nextLine().split(",");
                if (date.length == 5) {
                    lista.add(new Student(Integer.parseInt(date[0].trim()), date[1].trim(), date[2].trim(), date[3].trim(), Double.parseDouble(date[4].trim())));
                }
            }
            System.out.println("Import cu succes din: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Eroare la import: Fisier inexistent.");
        }
        return lista;
    }
}