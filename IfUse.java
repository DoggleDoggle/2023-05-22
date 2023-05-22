
public class IfUse {

	public static void main(String[] args) {

		/*
		 * 짝수,홀수판별
		 */
		int no1 = 51;

		if (no1 % 2 == 0) {
			System.out.printf("%d은 짝수 입니다.\n", no1); // % printf 치고 뒤에 , 찍고 변수

		} else {
			System.out.println(no1 + "은 홀수 입니다.");
		}

		/*
		 * 4의 배수 판별
		 */

		int no2 = 4010;
		if (no2 % 4 == 0) {
			System.out.printf("%d는 4의 배수\n", no2);

		} else {
			System.out.printf("%d는 4의 배수 아님! \n", no2);

		}

		/*
		 * 점수의 유효성 체크
		 */

		int kor = -90;
		if (kor >= 0 && kor <= 100) {
			System.out.printf("%d 는 유효한 점수 입니다.\n", kor);
		} else {
			System.out.printf("%d 는 유효한 점수가 아닙니다.\n", kor);
		}

		/*
		 * 윤년여부 출력
		 */
		int year = 2032;
		String msg = "";
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			msg = "윤년";
		} else {
			msg = "평년";

		}
		System.out.printf("%d 년은 %s 입니다\n", year, msg);

		/*
		 * 문자판단
		 */
		char c = '5';
		if (c >= 'X' && c <= 'Z') {
			System.out.printf(" %c 는 알파벳 대문자 입니다\n.",c);
		}
		 
		if (c >= 'a' && c <= 'z') {
			System.out.printf(" %c 는 알파벳 대문자 입니다\n.",c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf(" %c 는 숫자형태 문자 입니다\n.",c);
		
		
	}
		char idFirstLetter = 'a';
		if ((idFirstLetter >= 'A' && idFirstLetter <= 'Z')|| 
		(idFirstLetter>='a' && idFirstLetter <= 'z')){
			System.out.printf("%c 는 유효한 아이디 첫문자 입니다.",idFirstLetter);
			
		}else {
			System.out.printf("%c 는 유효한 아이디 첫문자 입니다.",idFirstLetter);

}}}
