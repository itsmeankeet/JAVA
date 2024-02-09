package TCP.Example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

class ClientHandler extends Thread{
    private Socket socket;
    public ClientHandler(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try (
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        ) {
            int number = in.readInt();
            int square = number* number;
            out.writeInt(square);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error 404" + e.getMessage());
        }
    }
}