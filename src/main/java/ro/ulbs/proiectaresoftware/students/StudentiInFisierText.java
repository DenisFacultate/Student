package ro.ulbs.proiectaresoftware.students;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class StudentiInFisierText implements IStudentiExport {
    private String fileName;

    public StudentiInFisierText(String fileName) { this.fileName = fileName; }

    @Override
    public void doExport(List<Student> studenti) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Student s : studenti) {
                writer.println(s.getNumarMatricol() + "," + s.getPrenume() + "," + s.getNume() + "," + s.getFormatieDeStudiu() + "," + s.getNota());
            }
            System.out.println("Export cu succes in: " + fileName);
        } catch (IOException e) {
            System.err.println("Eroare la export: " + e.getMessage());
        }
    }
}