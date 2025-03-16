package structural.composite;

import structural.composite.component.FileSystemObject;
import structural.composite.composite.Folder;
import structural.composite.leaf.File;

public class CompositeDemo {

    public static void main(String[] args) {

        FileSystemObject file1 = new File("abc.txt");
        FileSystemObject file2 = new File("def.txt");

        Folder folder = new Folder("downloads");
        folder.add(file1);
        folder.add(file2);

        folder.show();
    }
}
