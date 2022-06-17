package day17.collection.songdrill;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static SingerController singerController = new SingerController();

    public static void main(String[] args) {

        while (true) {
            System.out.println("**** 음악 관리 프로그램 ****");
            System.out.println("# 현재 등록된 가수: " + singerController.howManySinger());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("============================");
            System.out.print(">> ");
            String menu = sc.next();

            switch (menu.charAt(0)){
                case '1' :
                    regiSong();
                    break;
                case '2' :
                    informSong();
                    break;
                case '3' :
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }


        }
    }

    // 2. 노래 정보 검색
    private static void informSong() {
        System.out.println("\n # 검색할 가수명을 입력하세요");
        System.out.print("- 가수명: ");
        String singerName = sc.next();
        if(singerController.haveSinger(singerName)){
            System.out.printf("# %s 님의 노래 목록\n", singerName);
            System.out.println("============================");
            HashSet<String> songList = singerController.songInform(singerName);
            int idx = 0;
            for (String s : songList) {
                System.out.printf("* %d. %s\n", ++idx, s);
            }
        } else{
            System.out.println("# 해당 가수는 등록되지 않았습니다. ");
        }
        System.out.println();

    }

    // 1. 노래 등록하기"
    private static void regiSong() {
        System.out.println("\n # 노래 등록을 시작합니다. ");
        System.out.print("- 가수명: ");
        String singerName = sc.next();
        System.out.print("- 곡명: ");
        String songTitle = sc.next();
        if (singerController.haveSinger(singerName)){
            if(singerController.putData(singerName, songTitle)){
            System.out.printf("# %s 님의 노래목록에 '%s'곡이 추가되었습니다.\n",singerName, songTitle);
            } else {
                System.out.printf("# %s 님의 곡 %s는 이미 등록되어 있습니다.\n", singerName, songTitle);
            }
        } else {
            singerController.putNewData(singerName, songTitle);
            System.out.printf("# 아티스트 %s 님이 신규 등록되었습니다.\n", singerName);
        }


    }

}
