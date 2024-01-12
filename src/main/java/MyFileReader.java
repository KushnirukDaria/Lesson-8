import java.io.*;

public class MyFileReader {

    public void myHomework() {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
            throw new MyUncheckedException(e);
        }
    }
    public String readFile() throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            br.readLine();
        }
        return resultStringBuilder.toString();
    }
}
