package org.example.kiosk;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItems; // 메뉴 항목 리스트
    private String categoryName;  // 카테고리 이름

    // 생성자
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    // Getter 메서드: 외부에서 categoryName 값을 조회할 수 있게 제공s
    public String getCategoryName() {
        return categoryName;
    }

    // Setter 메서드: 외부에서 categoryName 값을 수정할 수 있게 제공
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // Getter 메서드: 외부에서 menuItems 값을 조회할 수 있게 제공
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
