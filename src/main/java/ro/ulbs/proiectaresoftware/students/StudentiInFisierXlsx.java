package ro.ulbs.proiectaresoftware.students;
import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport {
    private String fileName;

    public StudentiInFisierXlsx(String fileName) { this.fileName = fileName; }

    @Override
    public void doExport(List<Student> studenti) {
        System.out.println("Se simuleaza exportul in Excel in fisierul: " + fileName);
    }
}