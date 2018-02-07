package Robot;

import java.awt.AWTException;
import java.awt.Robot;

public class MovingMousePointer {

	public static void main(String[] args) throws AWTException {

		Robot r = new Robot();
		r.mouseMove(1000, 500);
	}

}
