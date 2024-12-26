import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; 
        int serverPort = 9090; 

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            System.out.println("Connected to the server!");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput;

            System.out.println("Enter messages to send to the server (type 'exit' to quit):");
            while (true) {
                userInput = consoleReader.readLine();
                writer.println(userInput);
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }
                String serverResponse = reader.readLine();
                System.out.println(serverResponse);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
