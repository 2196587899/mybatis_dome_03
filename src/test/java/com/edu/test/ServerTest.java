package com.edu.test;

import com.edu.mapper.SmbmsUserMapper;
import com.edu.mapper.Smbms_provider_mapper;
import com.edu.pojo.SmbmsUser;
import com.edu.pojo.Smbms_provider;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServerTest {

    private SqlSession sqlSession;

    @Before
    public void before1() throws IOException {
        //199000629 肖章熙
        //1. 加载mybatis核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2. 创建SqlSession工厂 build
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3. 创建绘画
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test3() throws Exception{
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        List<Smbms_provider> bill = mapper.findProviderAndBill("北京");

        for (Smbms_provider user:bill){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test1() throws Exception{
        SmbmsUserMapper mapper = sqlSession.getMapper(SmbmsUserMapper.class);
        List<SmbmsUser> userAndRole = mapper.findUserAndRole1();

        for (SmbmsUser user:userAndRole){
            try {
                System.out.println(
                        "用户编码:"+user.getUserCode()+" 用户名称:"+user.getUserName()+ " 电话:"+
                                user.getPhone()+" 地址:"+user.getAddress()+" 角色编码:"+ user.getSmbmsRole().getRoleCode()
                                +" 角色名称:"+user.getSmbmsRole().getRoleName()
                );

            }catch (NullPointerException e){
                System.out.println(e);
            }

        }
        sqlSession.close();
    }

}
