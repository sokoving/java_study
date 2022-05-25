package MiniGame;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. 게임 인원을 입력받는다 (2~4명)
        2. 인원만큼 이름을 입력받는다
        3. 실탄 개수를 입력받는다 (1~5개)
        4. 길이 6인 탄창에 실탄값(1)을 실탄 개수만큼 초기화
        5. 시작
         */

        // 1. playerNum  = 플레이어 수
        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int playerNum = sc.nextInt();
        sc.nextLine();
        System.out.println();

        // 2. player = 플레이어 이름 배열
        String[] players = new String[playerNum];
        System.out.println("플레이어의 이름을 등록합니다. ");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i + 1);
            players[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(players) + "참가!");


        // --------------------------------(범위 밖의 숫자 입력 시 다시 입력받기 필요)
        // 3. bulletNum = 실탄 개수
        int bulletNum = 0;
        System.out.print("실탄 개수 (1~5개) ==> ");
        bulletNum = sc.nextInt();
        sc.nextLine();
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        // 4. 길이 6인 탄창에 실탄값(1)을 실탄 개수만큼 초기화
            // cylinder = 길이 6인 탄창
        int[] cylinder = new int[6];

            // cylinder 에 실탄(1)을 bulletNum 개 랜덤 넣기
        int countBullet = 0;
        while (countBullet < bulletNum) {
                // 0~4 랜덤 인덱스 뽑기
            int rn = (int) (Math.random() * 6);

                // 같은 수를 뽑았으면 1로 바꾸지 않고 다시 뽑기
            if (cylinder[rn] == 1) {
                continue;
            }
            cylinder[rn] = 1;
            countBullet++;
        }

        // 장전된 탄창
        System.out.println("비밀" + Arrays.toString(cylinder));

        // 5. 시작할 사람 고르기 (idx: 0~ players.length-1)
        int startNum = (int) (Math.random() * (players.length - 1));
        System.out.printf("총을 돌렸습니다. %s부터 시작합니다.", players[0]);
        System.out.println();
        System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", players[0]);
        String gameStart = " ";
        System.out.println(gameStart);



        sc.close();
    }
}
