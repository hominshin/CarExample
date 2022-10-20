package CarExample;

import java.util.Scanner;

public class CarSimulation {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int carSpeed = 0;
		int choice = 0;
		String window = null;
		String tire = null;
		String gear = null;
		
		
		
		Scanner scr = new Scanner(System.in);
		Car myCar = new Car();
		
		
		while(true) {
		System.out.println();
		System.out.println("====================================================================================================");
		System.out.println("1.기어변속| 2.현재속도| 3.타이어교체| 4.창문| 5.와이퍼| 6.깜빡이| 7.자동차상태| 8.급브레이크| 9.종료");
		System.out.print("메뉴입력> ");
		choice = scr.nextInt();//선택창
		
			if(choice == 1) {
				System.out.println("====================================================================================================");
				System.out.print("기어를 입력해주세요: ");
				carSpeed=myCar.engineGearAdjustment();//자동차 속도
			}else if(choice == 2) {
				System.out.println("====================================================================================================");
				System.out.println("현재속도는"+ carSpeed+"km/h 입니다.");
			}else if(choice == 3) {
				System.out.println("====================================================================================================");
				myCar.tireChange();
			}else if(choice == 4) {
				System.out.println("====================================================================================================");
				myCar.windowCantrol();
			}else if (choice == 5) {
				System.out.println("====================================================================================================");
				myCar.wiperControl();
			}else if(choice == 6) {
				System.out.println("====================================================================================================");
				myCar.blinkerControl();
			}else if(choice == 7) {
				System.out.println("====================================================================================================");
				myCar.currentStatus();
			}else if(choice == 8) {
				System.out.println("====================================================================================================");
				myCar.suddenBreak();
			}else if(choice == 9) {
				System.out.println("====================================================================================================");
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - startTime)/60;
				System.out.println("총 운행시간은"+secDiffTime+"초 입니다.");
				System.out.println("운행을 종료합니다. 안녕히계세요");
				break;
			}
		
			
		}
		
	
		
		
		

	}

}
