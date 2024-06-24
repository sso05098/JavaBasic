package chap2;

class Printer {
	int numOfPapers = 0;

	public void addpaper(int amount) {
		if (amount > 0) {
			numOfPapers += amount;
			System.out.println(amount + "장 추가함.");
		} else
			System.out.println("추가할 용지가 0보다 커야함.");
	}

	public void print(int amount) {
		if (amount > numOfPapers) {
			System.out.println("용지가 부족합니다. 남은 용지 : " + numOfPapers);
		} else if (amount <= 0) {
			System.out.println("출력할 용지가 0보다 커야함.");
		} else
			numOfPapers -= amount;
		System.out.println("출력할 용지 수 : " + amount);
		System.out.println("남은 용지 수 : " + numOfPapers);

	}
}
