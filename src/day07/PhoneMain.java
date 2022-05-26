package day07;

public class PhoneMain {

    public static void main(String[] args) {

        // new: Heap에 동적 할당
        Phone galaxy = new Phone("갤럭시");  // Heap에 데이터 저장 공간이 동적 할당 되어 phone의 속성과 속성값이 저장된다
        Phone iphone = new Phone("아이폰");
        Phone note = new Phone("갤노트");
/*             ↑ Heap에 저장된 데이터의 주소가 변수에 저장된다
        System.out.println(galaxy); // galaxy과 iphone는 속성 데이터가 동일하지만 다른 주소를 가지고 있는 개별 객체다
        System.out.println(iphone);
*/

        // 도트연산자(.) : galaxy에 있는 Heap의 주소로 가서 powerOff를 한다.
        galaxy.powerOff();
        iphone.showSpec();

        System.out.println("=========================");

        galaxy.sendMessage(iphone, "안녕, 나는 갤럭시");
        galaxy.sendMessage(iphone, "메롱메롱~");
        galaxy.sendMessage(iphone, "히히");
        
        iphone.sendMessage(note, "갤럭시가 이상해");

        note.sendMessage(iphone, "그래?");

        iphone.checkMessages();
        galaxy.checkMessages();
        note.checkMessages();


   }
}
