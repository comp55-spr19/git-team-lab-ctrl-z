//comment one
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GOval;
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

	ArrayList<GOval> balls = new ArrayList<GOval>();
	
	public void run2() {
		addMouseListeners();
		
		Timer aTimer = new Timer(2, this);
		aTimer.start();
		
	}//not working 
	
	public void mousePressed(MouseEvent e) {
		
		for(int i = 0; i< balls.size(); i++)
		{
			if(balls.get(i).getX()<100)
				return;
		}
		GOval ball = makeBall(SIZE/2, e.getY());
		add(ball);
		
		balls.add(ball);
	}//dugljdkyusghchange
	
	public GOval makeBall(double x, double y) {
		GOval temp = new GOval(x-SIZE/2, y-SIZE/2, SIZE, SIZE);
		temp.setColor(Color.RED);
		temp.setFilled(true);
		return temp;
	}//test
	
	public void actionPerformed(ActionEvent e) {
		   //TODO add what we want to do every two seconds
			for(int i =0; i< balls.size(); i++)
			{
				balls.get(i).move(2, 0);
			}
	}
	//}
//}
	// step 7
}



// step 5
// step 5 2

//step7
 //'master' of https://github.com/comp55-spr19/git-team-lab-ctrl-z.git
//github.com/comp55-spr19/git-team-lab-ctrl-z.git


//step 10asdfklasdjflksd
//break breka break adsf
//>>>>>>> branch 'master' of https://github.com/comp55-spr19/git-team-lab-ctrl-z.git
