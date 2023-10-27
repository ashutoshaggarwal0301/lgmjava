import java.io.FileWriter;
class writee {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("example.txt");

            // writing to a file
            myWriter.write("Hello!!");
            myWriter.write("Welcome to the Java course of CodesDope.");

            // closing the file
            myWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}