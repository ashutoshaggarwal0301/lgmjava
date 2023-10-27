import java.io.File;

class Filee {

    public static void main(String[] args) {
        File fileObj = new File("example.txt");

        try {
            // creating file
            boolean success = fileObj.createNewFile();

            // printing a message on screen
            if (success) {
                System.out.println("File got created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}