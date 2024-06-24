package chap2;

public class PrinterTest {
	public static void main(String[] args) {
		// printer 클래스를 테스트하는 코드

		// 객체 생성
		Printer p = new Printer();
		// 프린터 용지 100개 추가
		p.addpaper(100);
		// 프린터 용지 70개 출력
		p.print(70);

	}
}
