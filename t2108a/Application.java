package shop.t2108a;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Danh sach san pham");
                repository.show();
                break;
            case 2:
                System.out.println("cac san pham co gia tri tren 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmoutSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("San pham sau khi sap xep: ");
                repository.show();
        }
    }
}
