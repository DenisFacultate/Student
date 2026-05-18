package ro.ulbs.proiectaresoftware.students;

import java.util.List;

public class Exporter {
    public void startExport(IStudentiExport strategy, List<Student> studenti) {
        strategy.doExport(studenti);
    }
}