package TCP.CalculateSquare;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    public ClientHandler(Socket socket) {
        this.socket = socket;
        try{
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occured " + e.getMessage());
        }
        this.start();
    }
    public void run() {
        try {
            int number = in.readInt();
            int square = number * number;
            out.writeInt(square);
        }catch( Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
