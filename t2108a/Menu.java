package shop.t2108a;

public class Menu {
    public static void mainMenu(){
        System.out.println("1 - Xem thong tin san pham ");
        System.out.println("2 - in danh sach san pham co gia tri tren 10.000 ");
        System.out.println("3 - dem so san pham co so luong ban tu 50 tro len ");
        System.out.println("4 - liet ke san pham dua theo loai san pham ");
        System.out.println("5 - sap xep san pham theo so luong ban duoc ");
        System.out.println("6 - dua ra san pham ban duoc nhieu nhat ");
        System.out.println("7 - sap xep san pham theo ten ");
        System.out.println("0 - thoat chuong trinh ");
        System.out.println("lua chon cua ban la: ");
    }
    public static void chooseCategory() {
        System.out.println("1 - thuc pham");
        System.out.println("2 - do gia dung");
    }
    public static void secondMenu(){
        System.out.println("1 - sua thong tin san pham");
        System.out.println("2 - Xoa san pham");
        System.out.println("0 - Quay ve trang chu");
        System.out.println("Lua chon cua ban la:");
    }
}
