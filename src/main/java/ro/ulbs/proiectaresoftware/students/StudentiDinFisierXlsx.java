package ro.ulbs.proiectaresoftware.students;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierXlsx implements IStudentiImport {
    private String fileName;

    public StudentiDinFisierXlsx(String fileName) { this.fileName = fileName; }

    @Override
    public List<Student> doImport() {
        System.out.println("Se simuleaza importul din Excel din fisierul: " + fileName);
        return new ArrayList<>();
    }
}