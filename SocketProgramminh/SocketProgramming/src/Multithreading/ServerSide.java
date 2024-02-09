package Multithreading;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) {
	int port = 9997;
	try {
	    ServerSocket serverSocket = new ServerSocket(port);
	    while(true) {
		System.out.println("Server is waiting for new clients..");
		Socket socket = serverSocket.accept(); 
		System.out.println("Server is connected to the port " + port);
		ClientHandler clientHandler = new ClientHandler(socket);
	    }
	}catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e.getMessage());
	}
    }
}