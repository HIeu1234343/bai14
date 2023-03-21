package shop.t2108a;
import java.util.ArrayList;
import  java.util.Comparator;
import java.util.List;
public class Repository {
    List<Product> listProduct = new ArrayList<>();
    public Repository(){
        listProduct.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProduct.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProduct.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProduct.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProduct.add(new Product("05", "Thìa inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProduct.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProduct.add(new Product("07", "Nước hoa", Category.COSMETIC, 140, 92000, 88));
        listProduct.add(new Product("08", "Combo gội xả Hairburst", Category.COSMETIC, 100, 639000, 7));
        listProduct.add(new Product("09", "Tinh chất dưỡng ẩm", Category.COSMETIC, 50, 249000, 24));
        listProduct.add(new Product("10", "Kem dưỡng", Category.COSMETIC, 80, 715000, 63));
        listProduct.add(new Product("11", "Áo thun STUN", Category.FASHION, 250, 320000, 146));
    }
    public void show(){
        listProduct.forEach(product -> System.out.println(product));
    }
    public void sortProductByName(){

        listProduct.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }
    public void countProductByAmoutSale(){
        long count = listProduct.stream()
                .filter(product ->product.getAmountSale() >= 50)
                .count();
        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }
    public void filterProductByPrice(){
        listProduct.stream()
                .filter(product -> product.getPrice() >10000)
                .forEach(product -> System.out.println(product));

    }
}