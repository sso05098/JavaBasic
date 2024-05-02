package 도전과제3;

class Girl {
	protected String name; // protected 필드로 변경

	Girl(String name) { // 기본 생성자 제거, 매개변수가 있는 생성자 추가
		this.name = name;
	}

	void show() {
		System.out.println(name + "는 자바 초보자이다."); // '그녀는' 대신 name 출력
	}
}