import java.io.File;
import java.io.IOException;

public class FileClassDemo {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try {


            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }


            System.out.println("Absolute path: " + file.getAbsolutePath());


            System.out.println("Writable: " + file.canWrite());

            System.out.println("Readable: " + file.canRead());

            System.out.println("Size: " + file.length() + " bytes");


        } catch (IOException e) {


            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}