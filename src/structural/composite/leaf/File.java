package structural.composite.leaf;

import structural.composite.component.FileSystemObject;

public class File implements FileSystemObject {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        System.out.println("Filename: "+fileName);
    }

    @Override
    public void add(FileSystemObject fileSystemObject) {
        throw new UnsupportedOperationException("Cannot add a FileSystemObject to a file.");
    }
}
