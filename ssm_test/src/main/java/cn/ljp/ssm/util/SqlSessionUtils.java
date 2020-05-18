package cn.ljp.ssm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * create by ljb  on 2020/5/1014:02
 * mybatis_test--JDBCUtils
 * function  提供mybatis的 SqlSession对象
 * design
 */
public class SqlSessionUtils {

    private static SqlSession sqlSession;

    //say：初始化操作
    static {
        try {
//            InputStream in =SqlSessionUtils.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml")
            InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
            sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取sqlSession的对象
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        return sqlSession;
    }

    /**
     * 获取MyBatis实现的数据层接口
     *
     * @return
     */
    public static Object getDao(Class cls) {
        return  sqlSession.getMapper(cls);
    }



    /**
     * 关闭前提交事务
     *
     * @param sqlSession
     */
    public static void close(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.commit();   //say：关闭的时候提交事务
            sqlSession.close();
        }
    }
}
