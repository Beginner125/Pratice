package person.liming.test.test58;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliming
 * @Description 使用redis保存数据，并进行持久化
 * @Date: Created in 9:062020/6/20
 */
public class Test58 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        jedis.set("key", "redis");
        jedis.lpush("list", "baidu");
        jedis.lpush("list", "google");
        jedis.lpush("list", "bing");
        System.out.println("服务正在运行"+jedis.get("key"));
    }
}
