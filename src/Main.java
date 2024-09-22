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
        mapper.selectAllUser().forEach(System.out::println);
    }
}
