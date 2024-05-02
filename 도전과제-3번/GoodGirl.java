package 도전과제3;

class GoodGirl extends Girl {
	GoodGirl(String name) {
		super(name); // 부모 클래스의 생성자 호출
	}

	@Override
	void show() {
		System.out.println(name + "는 자바를 잘 안다."); // '그녀는' 대신 name 출력
	}
}