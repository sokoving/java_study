package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;
import utill.Utill;

import java.util.Locale;
import java.util.Scanner;

// LibraryController의 static을 임폴트하기 > 경로를 안 써도 쓸 수 있다.
import static com.kh.practice.chap01_poly.controller.LibraryController.*;

public class LibraryMenu {

    private LibraryController lc;
    private Scanner sc;

    public LibraryMenu() {
        this.lc = new LibraryController();
        this.sc = new Scanner(System.in);
    }

    //--------------- 메서드 -------------//

    public void mainMenu() {
        System.out.println("메인메뉴 시작");
        // 회원 정보 받기
        String name = inputStr("이름 : ");
        int age = inputInt("나이 : ");
        char gender = (inputStr("성별 : ")).toUpperCase().charAt(0);
        // 회원 정보 도서관컨트롤러 mem으로 등록
        Member newMem = new Member(name, age, gender);
        lc.insertMember(newMem);

        while (true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지 ");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 ");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기\n");
            int menu = inputInt("메뉴 번호 : ");

            switch (menu){
                case 1:  // 1. 마이페이지
                    System.out.println(lc.myInfo().toString());
                    break;
                case 2: //2. 도서 전체 조회
                    selectAll();
                    break;
                case 3: // 3. 도서 검색
                    searchBook();
                    break;
                case 4: // 4. 도서 대여하기
                    rentBook();
                    break;
                case 9: // 9. 프로그램 종료하기
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
//                    return;
                default:
                    System.out.println("다시 입력해 주세요. ");
            }
        }

    }
    // case 4. 도서 대여하기
    private void rentBook() {
        System.out.println("\n================ 대여 도서 목록 ==================");
        selectAll();

        System.out.printf("# 대여할 도서 번호 입력: ");
        int bookNo = sc.nextInt();

        int result = lc.rentBook(bookNo - 1);

        switch (result) {
            case RENT_SUCCESS:
                System.out.println("# 성공적으로 대여 되었습니다.");
                break;
            case RENT_SUCCESS_WITH_COUPON:
                System.out.println("# 성공적으로 대여되었습니다. " +
                        "요리학원 쿠폰이 발급되었으니 " +
                        "마이페이지에서 확인하세요");
                break;
            case RENT_FAIL:
                System.out.println("# 나이 제한으로 대여할 수 없습니다.");
                break;
        }
    }

    // case 3. 도서 검색
    private void searchBook() {

        System.out.print("\n# 검색어: ");
        String keyword = sc.next();

        Book[] books = lc.searchBook(keyword);

        if (books.length == 0) {
            System.out.println("# 검색된 도서가 없습니다.");
        } else {
            System.out.printf("\n================= 검색 결과(검색어: %s) ==================\n", keyword);
            for (Book b : books) {
                System.out.println(b.toString());
            }
        }


    }

    //case 2. 도서 전체 조회
    private void selectAll() {
        Book[] books = lc.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d번째 도서: %s\n", i+1, books[i].toString());
        }
    }


    //--------------- 기타 메서드 -------------//
    public String inputStr(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public int inputInt(String msg) {
        System.out.print(msg);
        int inputNum = sc.nextInt();
        sc.nextLine();
        return inputNum;
    }
} // end class LibraryMenu
