package person.liming.test.test50;

import javax.smartcardio.CardException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description Java中模拟购物网站的购物车
 * @Date: Created in 16:422019/11/8
 */
public class Test50 {

    static ShopMall shopMall;
    static Scanner scanner = new Scanner(System.in);

    static {
        ArrayList<Goods> goods;
        goods = new ArrayList<>();
        goods.add(new Goods(1, "最新手表", 10, 100));
        goods.add(new Goods(2, "漂亮围巾", 2, 200));
        goods.add(new Goods(3, "潮流鞋子", 80, 1000));
        goods.add(new Goods(4, "电子产品", 6, 100));
        goods.add(new Goods(5, "小玩具", 1, 10));
        goods.add(new Goods(6, "儿童用品", 0, 50));
        shopMall = new ShopMall(goods);
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("请输入相应编号进行操作");
            System.out.println("1.加入购物车");
            System.out.println("2.修改购买数量");
            System.out.println("3.删除");
            System.out.println("4.退出");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    addCart();
                    break;
                case 2:
                    updateCart();
                    break;
                case 3:
                    delCart();
                    break;
                case 4:
                    System.exit(0);
                    default:
                        System.out.println("没有此选项");
                        break;
            }
        }
    }

    public static void addCart(){
        System.out.println(shopMall.getAllGoodsString());
        System.out.println("请输入要购买的商品编号和数量");
        int no = scanner.nextInt();
        int num = scanner.nextInt();
        try {
            shopMall.addCartContent(no, num);
        } catch (GoodsExecption goodsExecption) {
            System.out.println(goodsExecption.getMessage());
            System.out.println("请重新操作\n");
            return;
        }
        System.out.println(shopMall.getCartString());
    }

    public static void updateCart(){
        System.out.println(shopMall.getCartString());
        System.out.println("请输入要修改的购物车中商品编号和数量");
        int no = scanner.nextInt();
        int num = scanner.nextInt();
        try {
            shopMall.addCartContent(no, num);
        } catch (GoodsExecption goodsExecption) {
            System.out.println(goodsExecption.getMessage());
            System.out.println("请重新操作\n");
            return;
        }
        System.out.println(shopMall.getCartString());
    }

    public static void delCart(){
        System.out.println(shopMall.getCartString());
        System.out.println("请输入要购买的商品编号");
        int no = scanner.nextInt();
        try {
            shopMall.delCartContent(no);
        } catch (CardException e) {
            System.out.println(e.getMessage());
            System.out.println("请重新操作\n");
            return;
        }
        System.out.println(shopMall.getCartString());
    }
}
