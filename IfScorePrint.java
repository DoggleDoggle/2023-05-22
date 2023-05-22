
public class IfScorePrint {

	public static void main(String[] args) {
		int kor = 888;
		
		if (kor >= 0 && kor <= 100) {
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

				System.out.printf("%d 학점입니다 ", grade);
			}
		}
	}

}
