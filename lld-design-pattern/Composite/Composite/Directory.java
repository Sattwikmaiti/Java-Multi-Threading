package Composite;
import java.util.ArrayList; // import the ArrayList class

public class Directory implements FileSystem{
    String DirectoryName;
    ArrayList<FileSystem> filesystemList; // Create an ArrayList object

    public Directory(String DirectoryName) {
        this.DirectoryName = DirectoryName;
        filesystemList = new ArrayList<FileSystem>(); // Create an ArrayList object
    }
   
    
    public void addFileSystem(FileSystem fileSystem) {
        filesystemList.add(fileSystem);
    }
  
    @Override
    public void ls(){
        System.out.println("Directory Name: " + DirectoryName);
        for(FileSystem fileSystem : filesystemList){
            fileSystem.ls();
        }
    }

    
}
