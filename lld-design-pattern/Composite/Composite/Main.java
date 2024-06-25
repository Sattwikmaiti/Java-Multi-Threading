package Composite;

public class Main {

    public static void main(String[] args) {

        Directory root = new Directory("root");
        File file1 = new File("file1");
        File file2 = new File("file2");
        Directory subdirectory = new Directory("subrootdirectory");
        root.addFileSystem(file1);
        root.addFileSystem(file2);
        root.addFileSystem(subdirectory);
        FileSystem file3 = new File("file3");
        subdirectory.addFileSystem(file3);
        root.ls();

        
    }
    
}
