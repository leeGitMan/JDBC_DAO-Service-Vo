package edu.kh.jdbc.run;

import edu.kh.jdbc.model.service.TestService;
import edu.kh.jdbc.model.vo.TestVo;

public class Run2 {
	public static void main(String[] args) {
		// TB_TSET 테이블에 한 번에 3행 삽입
		
		TestService service = new TestService();
		
		
		TestVo vo1 = new TestVo(70,"제목70", "내용70입니다");
		TestVo vo2 = new TestVo(80,"제목80", "내용80입니다");
		TestVo vo3 = new TestVo(90,"제목90", "내용90입니다");
		
		
		try {
			int result = service.insert(vo1, vo2 ,vo3);
			
			if (result > 0 ) {
				System.out.println("성공!");
			}else {
				System.out.println("실패!");
			}
			
		}catch(Exception e) {
			// service , dao 수행 중 발생한 예외를 처리
			
			System.out.println("SQL 수행 중 오류 발생!");
			e.addSuppressed(e);
		}
	}

}
