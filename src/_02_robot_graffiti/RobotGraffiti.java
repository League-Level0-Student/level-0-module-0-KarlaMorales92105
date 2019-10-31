package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {	

public static void main(String[] args) {
	
	Robot karla = new Robot();
	
	karla.penDown();
	
	karla.setSpeed(20);
	
	karla.move(200);
	karla.turn(180);
	karla.move(100);
}

}
