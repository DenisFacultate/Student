package ro.ulbs.proiectaresoftware.students;

import java.util.List;

abstract class ExportTimeDecorator implements IStudentiExport {
    protected IStudentiExport decoratedExporter;

    public ExportTimeDecorator(IStudentiExport decoratedExporter) {
        this.decoratedExporter = decoratedExporter;
    }

    @Override
    public void export(List<Student> studenti) {
        decoratedExporter.export(studenti);
    }

    @Override
    public void doExport(List<Student> studenti) {
        decoratedExporter.doExport(studenti);
    }
}