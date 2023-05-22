
public class SwitchUse {

	public static void main(String[] args) {

		/*
		 * 짝수 홀수를 판별
		 */
		int num = 22;

		switch (num % 2) {
		case 0:
			System.out.println("짝수");
			break;

		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 1~6 사이의 정수 발생
		 */

		int diceNo = (int) (Math.random() * 6) + 1;
		switch (diceNo) {
		case 1:
			System.out.println("dice number:" + diceNo);
			break;

		case 2:
			System.out.println("dice number:" + diceNo);
			break;
		case 3:
			System.out.println("dice number:" + diceNo);
			break;
		case 4:
			System.out.println("dice number:" + diceNo);
			break;
		case 5:
			System.out.println("dice number:" + diceNo);
			break;
		case 6:
			System.out.println("dice number:" + diceNo);
			break;

		default:
			break;
		}
		/*
		 * 입력되는 키보드 문자열에 따라 게임캐릭터 이동
		 */
		char skill='R';
		
		switch (skill) {
		case 'Q':
			System.out.println("skill 실명 다트");
			break;
		case 'W':
			System.out.println("skill 신속한 이동");
			break;
		case 'E':
			System.out.println("skill 맹독다트 ");
			break;
		case 'R':
			System.out.println("skill 유독성 함정 ");
			break;
		case 'B':
			System.out.println("귀환");
			break;
						
		default:
			System.out.println("은신");
			break;
		}
	}
}
