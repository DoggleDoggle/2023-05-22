
public class IfScoreReturn {

	public static void main(String[] args) {
		
		/*
		 * 점수 유효성 체크
		 */
		int kor = 90;
		if (!(kor>=0 && kor <=100)) {
			//유효하지 않은 점수
			System.out.println(kor+"은 유효한 점수가 아닙니다.");
			return;
		} 
		/*
		 * 학점 계산
		 */
		char grade = ' ';
		
		if (kor >= 90) {
			grade = 'A';
		} else if (kor >= 80) {
			grade = 'B';
		} else if (kor >= 70) {
			grade = 'C';
		} else if (kor >= 60) {
			grade = 'D';

		} else {
			grade = 'F';

		}
		System.out.println(kor+"학점 입니당");
		
	}

}
