package day18.comparator;

import java.util.Comparator;

// 이름 오름차 정렬
public class NameAscendingcomparator implements Comparator<Person> {


    // compareTo : 이름을 유니코드로 비교하여 앞이 작으면 음수 리턴, 뒤가 작으면 양수, 같으면 0
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
