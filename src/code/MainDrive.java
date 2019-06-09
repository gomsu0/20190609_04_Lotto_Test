package code;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {

		
		System.out.println("로또프로그램입니다.");
		
		int[] thisWeekLottoNum = {10,34,38,40,42,43};
		int thisWeekBonusNum=32;
		int[]userInputLottonum= new int[6];
		
		int[]userAutoLottNum=new int[6];
		
		for(int i=0;i<userAutoLottNum.length;i++) {
			while (true) {
				int randomNum =(int) (Math.random()*45+1);
				
				boolean isDuplOK =true;
				
			   for (int num :userAutoLottNum) {
				   if(num==randomNum) {
					   isDuplOK=false;
				   }
			   }
			   
			   if(isDuplOK) {
				   userAutoLottNum[i]=randomNum;
				   break;
			   }
			   
			}
		}
		
		
		for(int auto:userAutoLottNum) {
			System.out.println(auto);
		}
		
		for (int i=0;i<userAutoLottNum.length;i++) {
			
			for(int j=0;j<userAutoLottNum.length-1;j++ ) {
				
				if(userAutoLottNum[j]>userAutoLottNum[j+1]) {
					
					int temp=userAutoLottNum[j];
					userAutoLottNum[j]=userAutoLottNum[j+1];
					userAutoLottNum[j+1]=temp;
					
				}
			}
		}
		System.out.println("정리된 랜덤숫자");
		for(int sorted :userAutoLottNum) {
			System.out.println(sorted);
		}
		
		//Math.random의 결과:0<=1소수를 랜덤으로생성. 0보다크고45보다작은수를 랜덤으로할려면 *45
		//ex)0.75124321564=>double
		
		
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
			boolean bonusNumCorrect=false;
			for(int i=0;i<userInputLottonum.length;i++) {
				if(thisWeekBonusNum == userInputLottonum[i]){
					bonusNumCorrect=true;
				
				}
			}
			if(correntCount==5) {
				System.out.println("2등당첨");
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
}

