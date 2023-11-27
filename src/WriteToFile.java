import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String []args){
        try{
            FileWriter myWriter = new FileWriter("text.txt");
            myWriter.write("Domnul Monenci de langa mine fura tot.");
            myWriter.close();
            System.out.println("Succesfully wrote to the file");
        }   catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
