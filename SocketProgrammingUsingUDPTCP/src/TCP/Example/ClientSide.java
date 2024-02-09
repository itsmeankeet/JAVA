package TCP.Example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        String ip = "localhost";
        DataInputStream in;
        DataOutputStream out;
        int port = 7896;
        Socket socket = null;
        try {
            socket = new Socket(ip, port);
            System.out.println("Client is connected to " + socket.getPort());
            in =new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name..");
            String msg = scanner.nextLine();
            scanner.close();
            out.writeUTF(msg);
            String serverMessage = in.readUTF();
            System.out.println("Server Response: " + serverMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(socket != null) {
                    socket.close();
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}