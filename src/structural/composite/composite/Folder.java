package structural.composite.composite;

import structural.composite.component.FileSystemObject;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemObject {

    private String folderName;
    private List<FileSystemObject> fileSystemObjects = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public void show() {
        System.out.println("Folder name: "+folderName);
        fileSystemObjects.forEach(FileSystemObject::show);
    }

    @Override
    public void add(FileSystemObject fileSystemObject) {
        fileSystemObjects.add(fileSystemObject);
    }

}
