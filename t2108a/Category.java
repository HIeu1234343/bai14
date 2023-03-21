package shop.t2108a;

public enum Category {
    FOOD("thực phẩm"), HOUSEWARE ("Đồ gia dụng"), COSMETIC("Mỹ phẩm"), FASHION("Thời trang");
    private String value;
    private Category(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
