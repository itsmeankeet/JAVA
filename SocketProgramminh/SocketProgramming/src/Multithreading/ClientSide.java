package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
	DataInputStream inputStream;
	DataOutputStream outputStream;
	Socket socket = null;
	try {
	    System.out.println("Trying to connect using client....");
	    socket = new Socket("localhost", 9997);
	    System.out.println("Successfully connected to the server localhost with port 9999");
	    inputStream = new DataInputStream(socket.getInputStream());
	    outputStream = new DataOutputStream(socket.getOutputStream());
	    System.out.println("Enter your name here:");
	    Scanner scanner = new Scanner(System.in);
	    String name = scanner.nextLine();
	    outputStream.writeUTF(name);
	    String newmsg = inputStream.readUTF();
	    System.out.println(newmsg);
	}
	catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e.getMessage());
	}finally {
	    try {
		socket.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }
}
