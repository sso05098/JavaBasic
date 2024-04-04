package NoOOP;

import java.util.Scanner;

public class BeomJunBookMarket {

	static final int NUM_MENU = 4;
	static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
			{ "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
			{ "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } };

	static int[] cartList = { 0, 0, 0 };
	static int numCartItem = 0;

	public static void main(String[] args) {
		displayWelcome();

		boolean quit = false;
		while (!quit) {
			int menu = displayGetMenu();
			switch (menu) {
			case 1:
				menuBookList();
				break;
			case 2:
				menuCartList();
				break;
			case 3:
				menuAddCartItem();
				break;
			case 4:
				menuClearCart();
				break;
			case 0:
				menuExit();
				quit = true;
			default:
				System.out.println("없는 메뉴입니다. 0번부터" + NUM_MENU + "번까지의 메뉴 중에서 선택하세요");
			}
		}

	}

	static void displayWelcome() {
		String welcome = "*****************************************\r\n"
				+ "*    Welcome to Beomjun Book Market     *\r\n" + "*****************************************\r\n";
		System.out.println(welcome);
	}

	static int displayGetMenu() {
		String menuStr = "=========================================\r\n" + "1. 도서 목록 보기\r\n" + "2. 장바구니 보기\r\n"
				+ "3. 장바구니에 도서 추가\r\n" + "4. 장바구니 비우기\r\n" + "0. 종료\r\n"
				+ "=========================================\r\n";
		System.out.println(menuStr);
		System.out.println(">> 메뉴 선택 : ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	static void menuBookList() {
		String booklist = ">> 도서 목록\r\n"
				+ "------------------------------------------------------------------------\r\n"

				+ "ID2401, 쉽게 배우는 자바 프로그래밍 2판, 우종정, 한빛아카데미, 20,000원, \r\n"
				+ "ID2402, 코딩 자율학습 HTML+CSS+자바스크립트, 김기수, 길벗, 30,000원, \r\n"
				+ "ID2403, Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편, 보요시바타, 이지스퍼블리싱, 25,000원, \r\n"
				+ "------------------------------------------------------------------------";
		System.out.println(booklist);

	}

	static void menuCartList() {
		if (numCartItem == 0) {
			System.out.println("장바구니가 비어 있습니다.");
		} else {
			for (int i = 0; i < cartList.length; i += 1) {
				if (cartList[i] != 0) {
					System.out.print(cartList[i] + "권, ");
					printBook(i);
				}
			}

		}
	}

	static void menuAddCartItem() {
		String addcartitem = ">> 도서 목록\r\n"
				+ "------------------------------------------------------------------------\r\n"
				+ "ID2401, 쉽게 배우는 자바 프로그래밍 2판, 우종정, 한빛아카데미, 20,000원, \r\n"
				+ "ID2402, 코딩 자율학습 HTML+CSS+자바스크립트, 김기수, 길벗, 30,000원, \r\n"
				+ "ID2403, Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편, 보요시바타, 이지스퍼블리싱, 25,000원, \r\n"
				+ "------------------------------------------------------------------------\r\n";
		while (true) {
			System.out.println(addcartitem);
			System.out.print(">> 추가할 도서 ID 입력 : ");
			Scanner input = new Scanner(System.in);
			String ID = input.nextLine();
			int index = -1;

			for (int i = 0; i < bookList.length; i++) {
				if (ID.equals(bookList[i][0])) {
					cartList[i] += 1;
					numCartItem += 1;
					System.out.println(">> 장바구니 추가 : " + bookList[i][1]);
					index = i;
				}
			}
			if(index == -1) {
				System.out.println(">> 없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");				
			} else {
				break;
			}
		}

	}

	static void menuClearCart() {
		if (numCartItem == 0) {
			System.out.println(">> 장바구니가 비어 있습니다.");
		} else {
			for (int i = 0; i < cartList.length; i++) {
				cartList[i] = 0;
				numCartItem = 0;
			}
			System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
		}
	}

	static void menuExit() {
		System.out.println(">> BeomJun Book Market을 종료합니다. ");
	}

	static void printBook(int num) {
		for (int i = 0; i < bookList[num].length; i += 1) {
			System.out.print(bookList[num][i] + " ");
		}
		System.out.println();
	}

}
