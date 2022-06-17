package day18.anonymous;


public class PetMain {
    public static void main(String[] args) {
        Pet dog = new Pet(){

            int age;

            @Override
            public void play() {
                System.out.println("강아지랑 놀아");
            }

            public void eat(){
                System.out.println("강아지 밥 먹어");
            }
        };

        dog.play();
        dog.eat();

    }
}
