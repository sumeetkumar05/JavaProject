package socketProgramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HostAddress {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getLocalHost();
		String hstName = ip.getHostName();
		String hstAddress= ip.getHostAddress();
//		String remoteIp = socket.getInetAddress().getHostAddress();
		System.out.println("Host name of machine: "+ hstName);
		System.out.println("Host Adddress of machine: "+ hstAddress);

	}

}
