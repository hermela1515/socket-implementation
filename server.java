import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int serverPort = 9090; 

        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            System.out.println("Server started and waiting for connections...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                // Set up input and output streams
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                String clientMessage;
                while ((clientMessage = reader.readLine()) != null) {
                    System.out.println("Received: " + clientMessage);
                    writer.println("Echo: " + clientMessage); 
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break; 
                    }
                }

                socket.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException ex) {
            System.out.println("Server error: " + ex.getMessage());
        }
    }
}
