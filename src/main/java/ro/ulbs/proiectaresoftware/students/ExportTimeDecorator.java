package ro.ulbs.proiectaresoftware.students;

import java.util.List;

class ExecutionTimeDecorator extends ExportTimeDecorator {

    public ExecutionTimeDecorator(IStudentiExport decoratedExporter) {
        super(decoratedExporter);
    }

    @Override
    public void export(List<Student> studenti) {
        long startTime = System.currentTimeMillis();

        super.export(studenti);

        long endTime = System.currentTimeMillis();
        System.out.println("-> Timp de executie (export): " + (endTime - startTime) + " ms");
    }

    @Override
    public void doExport(List<Student> studenti) {
        long startTime = System.currentTimeMillis();

        super.doExport(studenti);

        long endTime = System.currentTimeMillis();
        System.out.println("-> Timp de executie (doExport): " + (endTime - startTime) + " ms");
    }
}