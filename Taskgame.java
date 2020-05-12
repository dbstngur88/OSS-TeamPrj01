//묵찌빠 게임 코드 작성

import java.util.*;

public class DoubleRps   { 
	

	
	static void display(int user, int com) {
		   switch(user) {
           case 1:
           	System.out.println("User : 묵");
           	break;
           case 2:
           	System.out.println("User : 찌");
           	break;
           case 3:
           	System.out.println("User : 빠");
           	break;
           }
           switch(com) {
           case 1:
           	System.out.println("Com : 묵");
           	break;
           case 2:
           	System.out.println("Com : 찌");
           	break;
           case 3:
           	System.out.println("Com : 빠");
           	break;
           }
	}
	
	static int judgement (int user, int com)
	{
		if(user == 1) //주먹일 경우
		{
			if(com == 2) //주먹 vs 가위 > user 공격
				return 1;
			else if(com ==3) //주먹 vs 보 > com 공격
				return 0;
			else
				return 0;
		}
		else if (user == 2)  //가위일 경우
		{
			if (com == 3) //가위 vs 보 > user 공격
				return 1;
			else if(com == 1) // 가위 vs 주먹 > com 공격
				return 0;
			else
				return 0;
		}
		else if (user == 3) //보일 경우
		{
			if (com == 1) //보 vs 주먹 > user 공격
				return 1;
			else if(com == 2) //보 vs 가위 > com 공격
				return 0;
			else
				return 0;
		}
			else
				return 0;
		}
	
	
    public static void main(String args[]){
    	
    	int user = 0; //user 상태 기록 변수
    	int com = 0; //com 상태 기록 변수
    	int judge = 0; //판정 상태 기록 변수
    	int result = 0; //진행 상태 가록 변수

        
        Scanner readin = new Scanner(System.in);    //input용 scanner 생성
        
        
        
        //게임 동작
        System.out.println("====묵찌빠 게임을 시작합니다.====");
       
            do{   //run이 true일때만 활성화
            	 System.out.println("1.[묵] 2.[찌] 3.[빠] 중에 선택해주세요. 0.[종료] ");
                 System.out.println("선택:");
                user = readin.nextInt();       // 숫자값을 통한 user 선택
                com = (int)(Math.round(Math.random()*2)+1);	   // com 랜덤난수 설정
                
                if(user<0 || 3<user) //유효하지 않은 값 입력
                {
                 System.out.println("잘못 입력했습니다. 다시입력해주세요.\n");
                 continue;
                }
		    
		if(user == 0)
                {
                	System.out.println("게임을 종료합니다."); //게임을 종료
                	System.exit(0);
                }
		    
                display(user,com);
                if(user != com) //판정이 결정되면 루프 이탈
                	break;
            }while(true); //판정이 날 때까지 반복
                
                judge = judgement(user,com); //승부권 결정 메소드 호출 
                
                do {
                	switch(judge) { //판정에 따라
                	case 1 : 
                		System.out.println("user 공격!");  //이기는 중일 때
                		break;
                	case 0 :
                		System.out.println("Com 공격!"); //지고 있는 중일 때
                	}
                	 System.out.println("1.[묵] 2.[찌] 3.[빠] 중에 선택해주세요.");
                	 System.out.println("선택:");
                	 
                	 user = readin.nextInt();
                	 com = (int)(Math.round(Math.random()*2)+1);
			
			if(user<=0 || 3<user) //유효하지 않은 값 입력
                        {
                         System.out.println("잘못 입력했습니다. 1에서 3 사이의 수를 입력해주세요.\n");
                         continue;
                        }
                  	 
                	 display(user,com); //상태 출력
                	 if(user != com)
                		 judge = judgement(user,com);
                	 //결과가 나지 않았을 경우 선택에 따른 판정 재판독 후 결정
                	 else result = 1;
                	 //결과가 났을 경우 바로 루프 종료
                }while(result == 0);
            
                if(judge == 1)
                	System.out.println("축하합니다 ! User 승리!");
                else
                	System.out.println("아쉽습니다.. Com 승리!");
         
    
            }
    }
