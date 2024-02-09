import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) {
		System.out.println("Waiting for clients..");
		try {
			ServerSocket serverSocket = new ServerSocket(9806);
			Socket socket = serverSocket.accept();
			System.out.println("Connection Established");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( socket.getInputStream()));
			String messageString = bufferedReader.readLine();
			PrintWriter outPrintWriter = new PrintWriter(socket.getOutputStream(), true);
			outPrintWriter.println("Server says: " + messageString);
			socket.close();
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
