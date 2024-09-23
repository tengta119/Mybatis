import com.test.MybatisUtil;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        mapper.selectUserById(1);
        mapper.selectUserById(1);
    }
}
