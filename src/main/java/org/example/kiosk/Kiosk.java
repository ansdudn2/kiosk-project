package org.example.kiosk;


import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //필드
    private List<Menu> menus;

    //생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    //getter와 setter 추가
    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    //start 함수
    public void start() {

        //Scanner 사용
        Scanner sc = new Scanner(System.in);

        //전역변수 choice를 0으로 설정
        int choice = 0;
        while (true) {

            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");


            //for문을 이용해 매뉴 출력
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + "." + menus.get(i).getCategoryName());
            }

            System.out.println("0.종료");
            System.out.println("번호를 선택해주세요.");

            //상위 메뉴 선택
            while (true) {
                //숫자입력
                choice = sc.nextInt();
                if (choice == 0) {
                    // 종료 메시지 출력
                    System.out.println("키오스크를 종료합니다.");
                    return; // 첫 번째 루프 종료
                }
                //선택한 카테고리 출력
                if (choice != 0) {
                    if (choice >= 1 && choice <= menus.size()) {
                        Menu selectedMenu = menus.get(choice - 1);
                        selectedMenu.printMenu();

                        System.out.println("번호를 선택해주세요");
                        while (true) {
                            int itemChoice = sc.nextInt();
                            //매뉴 선택 및 출력
                            if (itemChoice > 0 && itemChoice <= selectedMenu.getMenuItems().size()) {
                                MenuItem selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);//매뉴선택
                                System.out.println("선택한 메뉴: " + selectedItem.getName());
                                System.out.println("가격: " + selectedItem.getPrice());
                                System.out.println("설명: " + selectedItem.getDescription());
                                break;//메뉴 선택 후 나가기
                            } else if (itemChoice == 0) {
                                break;//뒤로가기
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                                selectedMenu.printMenu(); // 메뉴 재출력
                                System.out.println("번호를 선택해주세요");
                            }
                        }
                        break; //메뉴 카테고리 선택후 종료
                    } else {
                        System.out.println("다시선택해주세요.");
                    }
                }
            }
        }
    }
}
