
public class IfTest1 {

//	컨트롤 쉬프트 f =정렬

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = false;
		if (condition) {
			System.out.println("stmy2");

		}
		System.out.println("stmt5");
		if (condition) {
			System.out.println("stnt6");
			System.out.println("stnt7");

		} else {
			System.out.println("stnt8");
			System.out.println("stnt9");
		}
		System.out.println("stnt10");

		if (condition) {
			System.out.println("stnt11");
			System.out.println("stnt12");

			if (condition)
				System.out.println("stnt13");

			else
				System.out.println("stnt13");

		}

		System.out.println("main block end");

		System.out.println("main block end");
		return;

		
		//System.out.println("after return end"); //Unreachable code 리턴 후에는 어떤
												//코드도 올 수 없따!!
		
	}

}
