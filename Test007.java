public class Test007 {
	public static void main(String[] args) {
		double i = 3.14;
		System.out.println(i);
		
		double j = 100;
		
		i = (int)100.0;
		
		System.out.println(j);
		System.out.println(i);
	}
}


/*

	int i= 100;
	double i = 3.14;
	
	double도 자료형이다. 
	자료형 이름 .. 이렇게 나오면 변수선언이다.

	double j = 100
	-- j라는 이름의 변수 기억공간에는 실수만 넣을 수 있다.
	-- 이건 대입시에 100은 100.0으로 변환되고 그 다음에 대입되었다는 얘기이다.
	-- "필에요 따라서 값은 그 형태를 바꾸는 경우가 있다."
	-- int 값에 double 형 변수면 int 값을 double로 바꾸고 그 다음에 대입한다.
	
	필수 암기사항
	java의 자료형은 8가지 : byte short int long (정수형) /  float double (실수형) /boolean char
	byte (8bit) short (16bit) int(32bit) long(64bit)
	int i;로 선언하면 이건 32bit 크기를 갖는 기억공간이 확보된다는 얘기이다
	
	float(32bit) double(64bit)
	double i; 로 선언되면 64bit 기억공간이 확보된다.
	
	byte < short < int < long < float < double
	"작은거에서 큰거는 자동형변환이 되지만 큰 것에서 작은 것으로는 자동형변환이 안 된다."

	(int)100.0; - 100.0 이라는 double 형 값을 int 형으로 강제로 변환시킨다.
	"강제 형 변환 또는 casting이라고 한다."
	
	double j = 100; -- 얘는 자동으로 변한다.
*/