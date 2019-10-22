package person.liming.test.test32;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import person.liming.test.test32.mapper.UserMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * @author liuliming
 * @Description 单独使用mybatis增删查改
 * @Date: Created in 14:002019/8/4
 */
public class Test32 {

    public static void main(String[] args) {
        String resource = "file/mybatis_conf.xml";
        InputStream in = null;
        //初始化输入流
        try {
            in = new FileInputStream(resource);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //创建sqlSession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();

        List<User> users = null;
        //查询
        UserMapper mapper = session.getMapper(UserMapper.class);
        users = mapper.list();

        //输出结果
        if(users != null){
            System.out.println(users.toString());
        }
    }
}
