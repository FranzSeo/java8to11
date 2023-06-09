package main.java.java8to11;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 annontmous inner class
        // RunSomething runSomething = new RunSomething() {
        //     @Override
        //     public void doIt(){
        //         System.out.println("Hello");
        //     }
        // };
        
        // 함수는 특수한 형태의 Object 따라서 함수는 Object로 묶여 있음 
        // 따라서 Return 가능하다.
        // RunSomething runSomething = () -> System.out.println("Hello");
        // runSomething.doIt();

        int num = 10;
        // local variable 사용시 참조 가능!!! 
        //     -> final이라고 가정 아닐 시 컴파일 에러 발생

        RunSomething runSomething = (number) -> number + num;
        
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(3));
    }
}
