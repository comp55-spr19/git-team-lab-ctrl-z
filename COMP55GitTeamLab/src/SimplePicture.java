//comment one
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		add(label);
	}
	int a = 0;//hello everyone from Jason :)
<<<<<<< HEAD
	
	// step 7
}
=======
}

// step 5
// step 5 2
>>>>>>> branch 'master' of https://github.com/comp55-spr19/git-team-lab-ctrl-z.git
