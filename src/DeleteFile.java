import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File myObj = new File("text.txt");
        if (myObj.delete()){
            System.out.println("File was deleted succesfully. " + myObj.getName());
        } else{
            System.out.println("Failed to delete the file");
        }
    }
}
