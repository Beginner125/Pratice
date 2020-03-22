package person.liming.test.test34;

import redis.clients.jedis.Jedis;

/**
 * @author liuliming
 * @Description 使用redis进行缓冲，每二十秒进行一次与数据库的同步
 * @Date: Created in 11:122019/8/5
 */
public class Test34 {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        //未完待续
    }
}
