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

    // Getter 메서드: 외부에서 menus 값을 조회할 수 있게 제공
    public List<Menu> getMenus() {
        return menus;
    }

    // Setter 메서드: 외부에서 menus 값을 수정할 수 있게 제공
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

            //for문을 이용해 매뉴 출력(카테고리 부분)
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + "." + menus.get(i).getCategoryName());
            }

            System.out.println("0.종료");
            System.out.println("번호를 선택해주세요.");

            //카테고리 번호 입력 받기
            while (true) {
                //숫자입력
                choice = sc.nextInt();
                if (choice == 0) {
                    //0을 입력하면 종료 메시지 출력 후 종료
                    System.out.println("키오스크를 종료합니다.");
                    return; // 키오스크 종료
                }
                //카테고리가 유효한 범위인지 확인
                if (choice != 0) {
                    if (choice >= 1 && choice <= menus.size()) {
                        //선택한 카테고리에 해당하는 메뉴 객체를 가져옴
                        Menu selectedMenu = menus.get(choice - 1);
                        selectedMenu.printMenu(); // 해당 카테고리의 메뉴 항목 출력

                        System.out.println("번호를 선택해주세요");

                        //메뉴 항목을 선택하는 루프
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
                                break;//0을 입력하면 뒤로가기
                            } else {
                                //잘못된 입력 처리
                                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                                selectedMenu.printMenu(); // 메뉴 재출력
                                System.out.println("번호를 선택해주세요");
                            }
                        }
                        break; //메뉴 카테고리 선택후 종료
                    } else {
                        //잘못된 카테고리 입력 처리
                        System.out.println("다시선택해주세요.");
                    }
                }
            }
        }
    }
}
