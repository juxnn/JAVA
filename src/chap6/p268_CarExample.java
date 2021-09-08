package chap6;

public class p268_CarExample {
	public static void main(String[] args) {
	p267_Car myCar = new p267_Car();
	
	//잘못된 속도변경
	myCar.setSpeed(-50);
	
	System.out.println("현재 속도: "+myCar.getSpeed());
	
	//올바른 속도 변경
	
	myCar.setSpeed(60);
	
	//멈춤
	if(!myCar.isStop()) {
		myCar.setStop(true);
	}
	
	System.out.println("현재 속도: "+myCar.getSpeed());
	}
}