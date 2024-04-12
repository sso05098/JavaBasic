package chap02;

	class Print {
		int numOfPapers = 0;
		//용지 추가
		public void addpaper(int amount) {
			numOfPapers += amount;
		}
		//용지 출력
		public void print(int amount) {
	            numOfPapers -= amount;       
	    }
	    public int getRemainPapers() {
		    return numOfPapers;
	    }
	}
	public class Printtttt {
		public static void main(String[] args) {
			Printer myPrinter = new Printer();
			
			myPrinter.addpaper(100);
			myPrinter.print(70);
			System.out.println(myPrinter.getRemainPapers());
	       }
	}

