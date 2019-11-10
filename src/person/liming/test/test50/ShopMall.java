package person.liming.test.test50;

import javax.smartcardio.CardException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:322019/11/10
 */
public class ShopMall {
    ArrayList<Goods> goods;
    HashMap<Integer, Integer> shopingCart;

    public ShopMall(ArrayList<Goods> goods) {
        this.goods = goods;
        shopingCart = new HashMap<>();
    }

    public String getAllGoodsString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("编号\t名称\t库存数量\t单价\n").append("+++++++++++++++++++++++++++++\n");
        for (Goods good :
                goods) {
            stringBuilder.append(good.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String getCartString(){
        StringBuilder stringBuilder = new StringBuilder();
        Set<Integer> keys = shopingCart.keySet();
        stringBuilder.append("编号\t商品名\t数量\n").append("+++++++++++++++++++++++++++++\n");
        for (Integer key :
                keys) {
            Goods goods = getGoods(key);
            stringBuilder.append(key).append("\t").append(goods.getName()).append("\t").append(shopingCart.get(key)).append("\n");
        }
        return stringBuilder.toString();
    }

    public void addCartContent(int no, int num) throws GoodsExecption {//TODO:添加购物车
        Goods goods = getGoods(no);
        if(goods == null){
            throw new GoodsExecption("不存在该商品");
        }
        if(goods.getStock() < num){
            throw new GoodsExecption("该商品仅有库存"+goods.getStock());
        }
        for (int i = 0; i < num; i++) {
            shopingCart.put(no, num);
        }
    }

    public void updateCartContent(int no, int num) throws GoodsExecption {//TODO:更新购物车
        addCartContent(no, num);
    }

    public void delCartContent(int no) throws CardException {//TODO:删除购物车
        if(shopingCart.get(no) == null){
            throw new CardException("购物车中不存在该信息");
        }
        shopingCart.remove(no);
    }

    public Goods getGoods(int no){
        for (Goods good:
             goods) {
            if(good.getNo() == no){
                return good;
            }
        }
        return null;
    }
}
