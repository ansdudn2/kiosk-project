package org.example.kiosk;

import java.util.List;

public class Menu {
    private String categoryName;  // 카테고리 이름
    private List<MenuItem> menuItems; // 메뉴 항목 리스트

    // 생성자
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    public String getCategoryName() {
        return categoryName;
    }

    // 카테고리 이름 반환
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
