package wrapperclass10;

import java.util.Scanner;

public class WrapperClass02 {
	public static void main(String[] args) {
		/*
		 * [Integer Wrapper클래스의 주요 메소드]
		 * 1] 숫자형식의 문자열을 숫자로 변경
		 * 	 static int parseInt(String s)
		 * 	 static Integer valueOf(String s)
		 */
		String strNumber = "1000";
		System.out.println("10+strNumber:"+ (10+strNumber));
		System.out.println("strNumber를 숫자로 변경(첫번째):"+(Integer.parseInt(strNumber)+10));
		System.out.println("strNumber를 숫자로 변경(첫번째):"+(Integer.valueOf(strNumber)+10));
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		//
		//int age = sc.nextInt(); <<문자 입력하면 여기서 에러남
		//System.out.println("당신의 10년후 나이:"+(age+10));
		String ageString = sc.nextLine();
		//사전 전처리가능 + int는 쓸수없고 String은 멤버들을 활용할 수 있음
		System.out.println(
				"당신의 10년후 나이:"
						+(Integer.parseInt(ageString)+10)); //<<문자입력하면 여기서 에러
		*/
		Integer numObj = Integer.parseInt(strNumber);//오토박싱
		System.out.println("문자열 1000을 byte형 값으로 변경(parseInt):"+numObj.byteValue());
		System.out.println(
				"문자열 1000을 byte형 값으로 변경(valueOf):"
						+Integer.valueOf(strNumber).byteValue());
		String money = "1억원";
		//Integer.parseInt(money); NumberFormatException: For input string: "1억원"
		//Integer.valueOf(money); NumberFormatException: For input string: "1억원"
		String floatString = "3.14";
		//Integer.parseInt(floatString); NumberFormatException: For input string: "3.14"
		System.out.println(Float.parseFloat(floatString)+10);
		System.out.println(Double.parseDouble(floatString)+10);
		/*
		 * 2]2진수나  8진수나 16진수 형식의 문자열을
		 * 십진수로 바꿀 때 사용하는 메소드
		 * static int parseInt(String s,int radix)
		 * static Integer valueOf(String s,int radix )
		 */
		System.out.println("이진수 형태의 문자열을 1000을 십진수로:"+Integer.parseInt(strNumber,2));
		System.out.println("8진수 형태의 문자열을 1000을 십진수로:"+Integer.parseInt(strNumber,8));
		System.out.println("16진수 형태의 문자열을 1000을 십진수로:"+Integer.parseInt(strNumber,16));
		/*
		 * 3]숫자를 문자열로 변경
		 * static String toString(int i)
		 * String toString()
		 */
		int num2 =1000;
		//3-1]정적 메소드 사용
		System.out.println(Integer.toString(num2)+10);
		//3-2]인스턴스형 메소드 사용
		Integer intObj = num2;
		System.out.println(intObj.toString()+10);
		System.out.println(new Integer(num2).toString()+10);
		/*
		 * 4]정수형태의 십진수를 각 진수형태 문자열로 변환
		 * static String toBinaryString(int i)
		 * static String toOctalString(int i)
		 * static String toHexString(int i)
		 */
		System.out.println(Integer.toHexString(15));
		Integer object=77;
		System.out.println("object="+object);
		System.out.println("object.toString()="+object.toString());
		System.out.println("object.hashCode()="+object.hashCode());
		/*
		 * 결론]
		 * [1]숫자형식의 문자열을 숫자로:parse계열 메소드
		 * static int parseInt();
		 * [2]valueOf()계열:
		 * [3]
		 */
	}
}
