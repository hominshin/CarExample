package CarExample;

import java.util.Scanner;

public  class Car implements CarDesign{
	public String[] window = new String[4];
	public String tire = null;
	public String gear = null;
	public String wiper = null;
	public String blinker = null;
	public int speed = 0;
		
	
	@Override
	public int engineGearAdjustment() {
		// TODO Auto-generated method stub	
		
		Scanner scr = new Scanner(System.in);
		gear = scr.nextLine();
										
		switch(gear) {
			
		    case "1":
		    	System.out.println("====================================================================================================");
				System.out.println("1단 속도증가");
				for(int i = 0; i<=10;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다. 기어를 2단으로해주세요");
				
				break;
		    	
			case "2":
				System.out.println("====================================================================================================");
				System.out.println("2단 속도증가");
				for(int i = 10; i<=20;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다. 기어를 3단으로해주세요");
				
				break;
			
			case "3":
				System.out.println("====================================================================================================");
				System.out.println("3단 속도증가");
				for(int i = 20; i<=30;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다. 기어를 4단으로해주세요");
				
				break;
			
			case "4":
				System.out.println("====================================================================================================");
				System.out.println("4단 속도증가");
				for(int i = 30; i<=40;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다. 기어를 5단으로해주세요");
				
				break;
			
			case "5":
				System.out.println("====================================================================================================");
				System.out.println("5단 속도증가");
				for(int i = 40; i<=50;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다. 기어를 6단으로해주세요");
				
				break;
				
			case "6":
				System.out.println("====================================================================================================");
				System.out.println("6단 속도증가");
				for(int i = 50; i<=100;i+=5) {
					speed = i;
					System.out.println(i+"km/h");
				}
				System.out.println("최고속도입니다.");
				break;	
				
			case "R":
				System.out.println("====================================================================================================");
				System.out.println("후진중");
				break;
			}		
			
			if(Integer.parseInt(gear)>7) {
				System.out.println("기어값을 읽을 수 없습니다. 1~6단, R단만 입력해세요");
			}
			
			return speed;
		
		
	
			
	}


	@Override
	public void tireChange() {
		// TODO Auto-generated method stub
		int choice = 0;
		
		Scanner scr = new Scanner(System.in);
		
		
		while(true) {
		
			System.out.println();
			System.out.println("1.미쉐린타이어 | 2.금호타이어 |3.한국타이어 |4.컨티넨탈타이어 ");
			System.out.print("교체할 타이어를 고르세요>");
			choice = scr.nextInt();
		
		
			if(choice == 1 ) {
			
				this.tire = "미쉐린타이어";
				System.out.println();
			
				System.out.println("타이어를" + tire + "로 교체합니다."	);
			
				break;
		
			}else if (choice == 2) {
			
				this.tire = "금호타이어";
				System.out.println();
				System.out.println("타이어를" + tire + "로 교체합니다."	);
			
				break;
		
			}else if (choice == 3) {
			
				this.tire = "한국타이어";
				System.out.println();
				System.out.println("타이어를" + tire + "로 교체합니다."	);
			
				break;
		
			}else if (choice == 4) {
			
				this.tire = "컨티넨탈 타이어";
				System.out.println();
				System.out.println("타이어를" + tire + "로 교체합니다."	);
			
				break;
		
			}else {
				System.out.println();
				System.out.println("입력값에 없는 타이어 입니다. 다시 선택해주세요");
		
			}
	
		
		}
		
	}


	@Override
	public void windowCantrol() {
		// TODO Auto-generated method stub
		
		   int choice = 0;
		   
		   Scanner src = new Scanner(System.in);
		   Scanner src2 = new Scanner(System.in);
		   
		   
		   System.out.println("1.열림 | 2. 닫힘");
		   choice = src.nextInt(); 
		   
		   if(choice == 1) {
			   System.out.println("창문선택");
			   System.out.println("1.운전석 | 2.조수석 | 3.뒷창문 오른쪽 | 4.뒷창문 왼쪽");
			   choice = src.nextInt();
			   
			   if(choice == 1 ) {
				   window[0] = "운전석 창문 open";
				   System.out.println(window[0]);
			   }else if(choice == 2) {
				   window[1] = "조수석 창문 open";
				   System.out.println(window[1]);
			   }else if(choice == 3) {
				   window[2] = "뒷창문 오른쪽 open";
				   System.out.println(window[2]);
			   }else if(choice == 4) {
				   window[3] = "뒷창문 왼쪽 open";
				   System.out.println(window[3]);
			   }else {
				   System.out.println("창문은 4개다");
			   }
		   }else if(choice == 2) {
			  System.out.println("창문선택");
			  System.out.println("1.운전석 | 2.조수석 | 3.뒷창문 오른쪽 | 4.뒷창문 왼쪽");
			  choice = src2.nextInt();
			  
			  if(choice == 1 ) {
				   window[0] = "운전석 창문 close";
				   System.out.println(window[0]);
			   }else if(choice == 2) {
				   window[1] = "조수석 창문 close";
				   System.out.println(window[1]);
			   }else if(choice == 3) {
				   window[2] = "뒷창문 오른쪽 close";
				   System.out.println(window[2]);
			   }else if(choice == 4) {
				   window[3] = "뒷창문 왼쪽 close";
				   System.out.println(window[3]);
			   }else {
				   System.out.println("창문은 4개다");
			   }
		   }else {
			   System.out.println("올바른 메뉴를 골라주세요");
		   }
		
	}


	@Override
	public void wiperControl() {
		// TODO Auto-generated method stub
		  int choice = 0;
		   Scanner scr = new Scanner(System.in);
		   
		   System.out.println("==================와이퍼 on/off========================");
		   System.out.println("                 1.켜기| 2.끄기                        ");
		   
		   choice = scr.nextInt();
		   
		   if(choice == 1) {
			   this.wiper = "와이퍼on";
			   System.out.println(wiper);
			   
		   }else if(choice == 2){
			   this.wiper = "와이퍼off";
			   System.out.println(wiper);
		   }else {
			   System.out.println("올바른 메뉴를 골라주세요");
		   }
		
	}


	@Override
	public void blinkerControl() {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int choice = 0;
		   
		   System.out.println("==================깜빡이 control========================");
		   System.out.println("        1.왼쪽| 2.오른쪽|3.비상|4.끄기                   ");
		   
		   choice = scr.nextInt();
		   
		   if(choice == 1) {
			   this.blinker = "왼쪽감빡이 on";
			   System.out.println(blinker);   
		   }else if(choice == 2){
			   this.blinker = "오른쪽깜빢이 on";
			   System.out.println(blinker);
		   }else if(choice == 3){
			   this.blinker = "비상깜빡이 on";
			   System.out.println(blinker);
		   }else if(choice == 4){
			   this.blinker = "깜빡이 off";
			   System.out.println(blinker);
		   }else {
			   System.out.println("올바른 메뉴를 골라주세요");
		   }
		
	}


	@Override
	public void currentStatus() {
		// TODO Auto-generated method stub
		System.out.println("내 자동차의 현재 상태를 출력합니다.");
		System.out.println();
		System.out.println("         현재속도:"+speed+"km/h"+
				            "         타이어: "+tire+
				            "          와이퍼: "+ wiper+
				            "           깜빡이: "+ blinker);
		for(int i = 0;i<=window.length;i++) {
			if(window[i]==null) {
				window[i] = "close";
			}
			System.out.print("       창문상태:"+window[i]);
		}
		
	}


	@Override
	public void suddenBreak() {
		// TODO Auto-generated method stub
		this.speed = 0;
		this.gear = "중립";
		System.out.println();
		System.out.println("자동으로"+gear+"으로바뀝니다."+"현재속도"+speed);
		
		
	}
	
	
	

	

}
