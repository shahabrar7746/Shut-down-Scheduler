import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class shutdown {

	public void shutDown() throws IOException, InterruptedException {
		String cmd = "shutdown /s /t 0025";
		FileWriter write = new FileWriter("Shut down.bat");
		write.write(cmd);
		write.close();
		Desktop desktop = Desktop.getDesktop(); 
		File file = new File("Shut down.bat");
		
		desktop.open(file);
		Thread.sleep(5000);
		file.deleteOnExit();
	}
	
	
}
