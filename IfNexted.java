
public class IfNexted {

	public static void main(String[] args) {

		/*
		 * 학점계산 (A,B,C,D,F)
		 */

		int g = 90;
		char grade = 'F';
		System.out.println("=================================================================");

		if (g >= 90 && g <= 100) {
			grade = 'A';

		} else {
			if (g >= 80 && g < 90) {
				grade = 'B';
			} else {
				if (g >= 70 && g < 80) {
					grade = 'C';
				} else {
					if (g >= 60 && g < 70) {
						grade = 'D';
					} else {
						grade = 'F';
					}

				}

			}
		}
		System.out.printf("1.학점은 %c 입니다 \n", grade);
		System.out.println("=================================================================");

		grade = 'F';
		if (g >= 90 && g <= 100) {
			grade = 'A';
		} else if (g >= 80 && g < 90) {
			grade = 'B';
		} else if (g >= 70 && g < 80) {
			grade = 'C';
		} else if (g >= 60 && g < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("1.학점은 %c 입니다 \n", grade);
	}
}
