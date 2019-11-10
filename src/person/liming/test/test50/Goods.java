package person.liming.test.test50;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:292019/11/10
 */
public class Goods {
    private int no;
    private String name;
    private int stock;
    private int price;

    public Goods(int no, String name, int stock, int price) {
        this.no = no;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(no).append("\t")
                .append(name).append("\t")
                .append(stock).append("\t")
                .append(price);
        return stringBuilder.toString();
    }
}
