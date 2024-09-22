import com.test.MybatisUtil;
import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        List<String> users = List.of("小刚", "小强", "小王", "小美", "小黑子");
        mapper.insertUsers(users);
    }
}
