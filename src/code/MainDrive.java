package code;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {

		
		System.out.println("로또프로그램입니다.");
		
		int[] thisWeekLottoNum = {10,34,38,40,42,43};
		
		int[]userInputLottonum= new int[6];
		
		Scanner scan =new Scanner(System.in);
		
		for(int i =0; i<userInputLottonum.length;i++) {
			while(true) {
				
				String message =String.format("%d번째숫자입력 :", i+1);
				
				System.out.print(message);
				
				int tempInput=scan.nextInt();
				
				boolean isRangeOK =false;
				
				  if(1<=tempInput && tempInput<=45) {
					  
					  isRangeOK = true;
				  }
				  boolean isDuplOk=true;
				  
				  for(int j=0;j<userInputLottonum.length;j++) {
					  
					  if(userInputLottonum[j]==tempInput) {
						  
						  isDuplOk=false;
					  }
				  }
				  if(isRangeOK && isDuplOk) {
					  
					  userInputLottonum[i]=tempInput;
					  
					  break;
				  }
				  else if(!isRangeOK) {
					  
					  System.out.println("잘못된숫자");
					  
					  System.out.println("다시입력");
				  }
				  else if(!isDuplOk) {
					  
					  System.out.println("중복된숫자");
					  
					  System.out.println("다시입력");
				  }
			}
		}
//		2등을 제외한 나머지 경우의 등수를 판정.
		int correntCount=0;
		
		for(int i=0;i<userInputLottonum.length;i++) {
			
		
			for(int j=0;j<thisWeekLottoNum.length;j++) {
				if(userInputLottonum[i]==thisWeekLottoNum[j]) {
					correntCount++;//맞춘 숫자
				}
		}
	   }
		if(correntCount==6) {
			System.out.println("1등당첨");
		}
		else if(correntCount==5) {
			System.out.println("3등당첨");
		}
		else if(correntCount==4) {
			System.out.println("4등당첨");
		}
		else if(correntCount==3) {
			System.out.println("5등당첨");
		}
		else  {
			System.out.println("꽝");
		}
	}
}
