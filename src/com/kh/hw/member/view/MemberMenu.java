package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();

    // 메인 메뉴 출력 메서드
    public void mainMenu() {

        while (true) {
            System.out.printf("\n# 최대 등록 가능한 회원수는 %d명입니다.\n", mc.SIZE);

            int count = mc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다.\n", count);

            System.out.println("======================================");

            System.out.println("# 1. 새 회원 등록");
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");

            System.out.println("\n# 메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 회원가입 진행
                    insertMember();
                    break;
                case 2:
                    // 회원 검색
                    serchMember();
                    break;
                case 3:
                    // 정보 수정
                    updateMember();
                    break;
                case 4:
                    // 회원 탈퇴
                    break;
                case 5:
                    // 전체 조회 출력
                    break;
                case 9:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하세요!");
            }
        }
    }
    // 3. 정보 수정
    private void updateMember() {
        System.out.println("1. 비밀번호 수정하기");
        System.out.println("2. 이름 수정하기");
        System.out.println("3. 이메일 수정하기");
        System.out.println("9. 메인으로 돌아가기");

        int menu = inputInt("메뉴 번호 : ");

        switch (menu){
            case 1:
                //비밀번호 수정
                updatePassword();
                break;
            case 2:
                // 이름 수정
//                updateName();
                break;
            case 3:
                // 이메일 수정
//                updateEmail();
                break;
            case 9:
                //메인으로 돌아가기
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }

    }

    // 3-1 비밀번호 수정
    private void updatePassword() {
        String targetId = inputStr("수정할 ID");
        int targetIdx = mc.findIndexById(targetId);
        if (targetIdx == -1) {
            System.out.println("존재하지 않는 아이디입니다.");
        }

        String targetPassword = inputStr("수정할 비밀번호");
    }


    // 2. 회원 검색
    private void serchMember() {
        System.out.println("\n============ 회원 정보 검색 ============");
        System.out.println("# 1. 아이디로 검색하기");
        System.out.println("# 2. 이름으로 검색하기");
        System.out.println("# 9. 메인으로 돌아가기");

        int menu = inputInt("- 메뉴 입력: ");
        switch (menu){
            case 1:
            // 아이디 검색
                serchId();
                break;
            case 2:
                // 이름 검색
                serchName();
                break;
            case 9: break;
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }

    // 메뉸 2-2 이름 검색
    private void serchName() {
        String targetName = inputStr("- 조회할 이름: ");
        Member[] members = mc.searchName(targetName);
        if (members.length == 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (int i = 0; i < members.length ; i++) {
                System.out.println(members[i].inform());
            }
        }
    }

    // 메뉴 2-1 아이디 검색
    private void serchId() {
        String targetId = inputStr("-  조회할 아이디: ");
        Member member = mc.searchId(targetId);
        if(member != null){
            System.out.println("\n============ 검색된 회원 정보 ============");
            System.out.println(member.inform());
        } else {
            System.out.println("\n- 존재하는 회원이 아닙니다. ");
        }
    }





    // 1. 새 회원 등록
    private void insertMember() {
        System.out.println("새 회원을 등록합니다. ");
        //아이디 입력, 중복 검사
        String id;
        while (true) {
            id = inputStr("아이디 : ");
            if (!mc.checkId(id)) break;
            System.out.println("중복된 아이디입니다.");
        }

        String name = inputStr("이름 : ");
        String password = inputStr("비밀번호 : ");
        String email = inputStr("이메일 : ");

        // 성별 유효값 검사
        char gender;
        while (true){
            gender = inputStr("성별(M/F) : ").toUpperCase().charAt(0);
            if (gender == 'F' || gender == 'M') break;
            System.out.println("성별을 다시 입력하세요");
        }

        int age = inputInt("나이 : ");

        mc.insertMember(id, name, password, email, gender, age);
    }

    // 입력 처리를 간단하게 만드는 메서드
    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }

    private int inputInt(String msg) {
        System.out.printf(msg);
        return sc.nextInt();
    }

}
