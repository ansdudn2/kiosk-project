package org.example.kiosk;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List
        List<MenuItem> burgerItems = new ArrayList<>();
        List<MenuItem> drinkItems = new ArrayList<>();

        // Menu 객체 생성을 통해 이름 설정
        Menu burgerMenu = new Menu("Burgers", burgerItems);

        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 다른 카테고리 메뉴 추가(음료)
        Menu drinkMenu = new Menu("Drinks", drinkItems);  // "Drinks"라는 이름의 Menu 객체 생성
        drinkItems.add(new MenuItem("Lemonade", 3.5, "새콤한 레모네이드"));
        drinkItems.add(new MenuItem("Iced Tea", 2.8, "차가운 아이스티"));

        // Kiosk 객체 생성
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);  // Burger 카테고리 추가
        menus.add(drinkMenu);   // Drink 카테고리 추가

        //키오스크 객체를 생성하여 start() 메서드 실행
        Kiosk kiosk = new Kiosk(menus);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}