package com.mnu.exam02;

class Sawon2 {
    String name;
    //예외처리를 떠넘기다
    //throws : 미루기
    //throw : 예외발생

    // throws를 통해 예외가 발생하면 호출한 쪽(main)으로 넘기겠다고 선언
    void print() throws NullPointerException {
        if (name.equals("aaaa")) {
            System.out.println("name=" + name);
        } else {
            System.out.println("name=null");
        }
    }
}

public class Exam_10 {
    public static void main(String[] args) {
        Sawon2 sa = new Sawon2();

        try {
            sa.print(); // 여기서 NullPointerException이 발생해서 아래 catch로 이동합니다.
        } catch (NullPointerException e) {
            // catch 블록 안에 실행할 코드를 중괄호{}로 넣어줘야 합니다.
            System.out.println("이름이 없으면 에러가 발생합니다.");
        }
    }
}