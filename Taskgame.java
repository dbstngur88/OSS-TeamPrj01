//묵찌빠 게임 코드 작성

import java.util.scanner;

public class DoubleRps { 
    
    public static void main(String args[]){
    
        //프로그램 작동용 변수 및 배열 생성
        String rps[] = { "가위", "바위", "보" };     //가위,바위, 보 비교용 배열 생성
        Scanner readin = new Scanner(System.in);    //input용 scanner 생성
        int count = 0;                              //실행 횟수 확인용 count변수 생성
        boolean run = true;                         //실행 여부 확인용 boolean타입 변수 생성
        
        //게임 동작
            while(run){   //run이 true일때만 활성화
                System.put.println("묵찌빠를 시작합니다.");
                System.put.println("가위, 바위, 보 중에 선택해주세요.");
        
                String input = readin.nextLine();       // input문자열 변수에 입력 값 등록
        
                //프로그램 종료 조건 : stop 입력
                if(input.equals("stop")){
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                }
                
                int rpsindex = (int)(Math.random) * rps.length);  //Math.random()을 통해 난수로 컴퓨터의 묵찌빠 정보 생성
                String Comrps = rps[rpsindex];                    //선택된 정보를 Comrps에 저장
                
            }
  
    }
}
