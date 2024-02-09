package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    DataInputStream in;
    DataOutputStream out;
    Socket client;
    public ClientHandler(Socket client) {
	// TODO Auto-generated constructor stub
	this.client = client;
	try {
	    in = new DataInputStream(client.getInputStream());
	    out = new DataOutputStream(client.getOutputStream());
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e.getMessage());
	}
	this.start();
    }
    
    public void run() {
	try {
	    String msgString = in.readUTF();
	    out.writeUTF("Server says: Hello " + msgString);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    // TODO: handle exception
	}
    }
}
