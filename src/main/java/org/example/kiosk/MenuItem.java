package org.example.kiosk;

public class MenuItem {

    //필드
    private double price; //가격
    private String description; //설명
    private String name; //이름

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter 메서드: 외부에서 name 값을 조회할 수 있게 제공
    public String getName() {
        return name;
    }

    // Setter 메서드: 외부에서 name 값을 수정할 수 있게 제공
    public void setName(String name) {
        this.name = name;
    }

    // Getter 메서드: 외부에서 price 값을 조회할 수 있게 제공
    public double getPrice() {
        return price;
    }

    // Setter 메서드: 외부에서 price 값을 수정할 수 있게 제공
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter 메서드: 외부에서 description 값을 조회할 수 있게 제공
    public String getDescription() {
        return description;
    }

    // Setter 메서드: 외부에서 description 값을 수정할 수 있게 제공
    public void setDescription(String description) {
        this.description = description;
    }

}