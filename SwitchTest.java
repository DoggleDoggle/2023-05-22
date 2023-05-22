
public class SwitchTest {

	public static void main(String[] args) {

		int level = 3; // 게임 레벨 1-5 사이의 점수

		switch (level) {

		case 1:
			/* 명령문 위치 */
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * break-->swich block을 빠져 나간다.
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고인물");
			break;

		default:
			System.out.println("확인되지 않은 계정");

			break;
		}

	}

}
