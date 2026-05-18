package ro.ulbs.proiectaresoftware.students;

import java.util.List;

public class Importer {
    public List<Student> startImport(IStudentiImport strategy) {
        return strategy.doImport();
    }
}
