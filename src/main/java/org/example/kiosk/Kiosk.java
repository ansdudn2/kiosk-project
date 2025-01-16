package org.example.kiosk;


import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //필드
    private final List<MenuItem> menuItems;

    //생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //start 함수
    public void start() {
        //Scanner 사용
        Scanner sc = new Scanner(System.in);
        //전역변수 choice를 0으로 설정
        int choice = 0;
        do {
            // 메뉴
            System.out.println("[ SHAKESHACK MENU ]");
            //for문을 이용해 매뉴 출력
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem food = menuItems.get(i);
                System.out.println((i + 1) + "." + food.getName() + " | W " + food.getPrice() + " | " + food.getDescription());
            }
            System.out.println("0.종료");
            System.out.println("번호를 선택해주세요.");
            //숫자입력
            choice = sc.nextInt();
            //매뉴 선택 및 출력
            if (choice != 0) {
                if (choice <= 4) {
                    MenuItem select = menuItems.get(choice - 1);//매뉴선택
                    System.out.println("선택한 메뉴:" + select.getName());
                    System.out.println("가격:" + select.getPrice());
                    System.out.println("설명:" + select.getDescription());
                } else {
                    System.out.println("다시선택해주세요.");
                }
            }
        } while (choice != 0); //choice가 0이아니면 반복
        System.out.println("키오스크를 종료합니다");
    }
}