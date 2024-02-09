package TCP.Example;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) {
        int serverPort = 9988;
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            System.out.println("Waiting for clients...");
            socket = serverSocket.accept();
            System.out.println("Server is connected to client\n");
            ClientHandler handler = new ClientHandler(socket);
            handler.start();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error 404 "+ e.getMessage());
        }
    }
}