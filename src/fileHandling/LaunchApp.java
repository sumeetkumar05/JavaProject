package fileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class LaunchApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//			Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe", null, new File("C:\\Windows\\System32"));
		Desktop desktop = Desktop.getDesktop();
		desktop.open(new File("C:\\Windows\\System32\\cmd.exe"));
	}
}
