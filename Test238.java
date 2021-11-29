package banana;

import static banana.Logic.apple;

class Logic {
	public static int apple(int i) {
		
		/*
			apple(5)=[120]
				return 5*apple(4)=[24]
				apple(4);
					return 4*apple(3)=[6]
					apple(3);
						return 3*apple(2)=[2]
						apple(2);
							return 2*apple(1)=[1]
							pple(1);
								return 1*apple(0)=[1]
								apple(0);
									return 1;
		*/
		
		if (i !=0) {
			return i* apple(i-1);
		}
		else {
			return 1;//종료
		}
	
	}
}

public class Test238 {
	public static void main(String[] args) {
		int r = apple(5);
		System.out.println(r);
	}
}

/*
	재귀호출은 모든 언어가 기본적으로 제공하는 개념이다.
*/