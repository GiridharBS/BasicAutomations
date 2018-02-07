package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class OpenNotePadAndType {

	public static void main(String[] args) throws IOException, AWTException {

		Runtime.getRuntime().exec("notepad");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_A);
	}

}
