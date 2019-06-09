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
		
		
	}
}
