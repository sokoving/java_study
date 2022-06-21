package datastructure.chap09;
/*
   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
     <----->          =>   1회
         <--->
   <----------->
             <--->    =>   2회
         <--------->
             <------>
               <------->
                   <------>  =>  3회
                   <--------->
       <------------------------>
                            <-------> => 4회


        주의 ) 2, 2 일 경우 시작하자마자 끝나는 회의이므로 횟수에 추가할 수 있다.
              다만 1, 2가 있을 경우 실제로 2개의 회의가 겹치지 않을 수 있지만
              로직상 1, 2보다 2, 2가 먼저 등장한 경우 나중에 나온 1, 2가 카운팅되지 않는다.
              따라서 종료시간이 같은 경우 시작시간을 먼저 배치하도록 정렬해야 한다.
 */

// 백준 1913
public class 달팽이 {
}
