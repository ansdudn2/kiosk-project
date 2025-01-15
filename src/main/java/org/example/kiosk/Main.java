package org.example.kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
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
                System.out.println((i + 1.) + food.getName() + " | W " + food.getPrice() + " | " + food.getDescription());
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