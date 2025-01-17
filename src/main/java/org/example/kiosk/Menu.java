package org.example.kiosk;

import java.util.List;

public class Menu {
    private final String categoryName;  // 카테고리 이름
    private final List<MenuItem> menuItems; // 메뉴 항목 리스트

    // 생성자
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // MenuItem 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // MenuItem 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 메뉴 출력
    public void printMenu() {
        System.out.println("=== " + categoryName + " 메뉴 ===");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0.뒤로가기"); //뒤로가기 추가
    }
}
