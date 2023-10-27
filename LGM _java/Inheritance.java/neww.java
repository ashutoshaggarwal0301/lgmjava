import java.io.FileWriter;

class neww {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("example.txt");
            // writing to a file
            myWriter.write("Hello!!");
            myWriter.write("\nWelcome to the Java");

            // closing the file
            myWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}