import com.test.entity.User;
import com.test.MybatisUtil;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        //System.out.println(mapper.selectUserById(1));
        //mapper.selectAllUser().forEach(System.out::println);
//        User nig = new User().setAge(10).setName("Nig");
//        System.out.println("--------------------------------------------------");
//        mapper.insertUser(nig);
//        System.out.println(nig);
        //mapper.selectAllUser().forEach(System.out::println);
        User user = mapper.selectUserById(1);
        user.setAge(100);
        int i = mapper.updateAgeById(user);
        System.out.println(user);
    }
}
