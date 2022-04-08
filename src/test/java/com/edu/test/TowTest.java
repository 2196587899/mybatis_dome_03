package com.edu.test;

import com.edu.mapper.Smbms_address_mapper;
import com.edu.mapper.Smbms_provider_mapper;
import com.edu.pojo.Address;
import com.edu.pojo.Smbms_provider;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TowTest {

    private SqlSession sqlSession;

    @Before
    public void before1() throws IOException {
        //199000629 肖章熙
        //1. 加载mybatis核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2. 创建SqlSession工厂 build
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3. 创建绘画
        sqlSession = sqlSessionFactory.openSession(true);
    }


    @Test
    public void test4(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        mapper.deleteProName("兴化佳美调味品厂");
        sqlSession.close();
    }


    @Test
    public void test3(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        Smbms_provider provider = new Smbms_provider();
        provider.setProName("深圳市泰香米业有限公司");
        provider.setProContact("赵亮");
        provider.setProPhone("15978454152");
        provider.setModifyDate(new Date());
        provider.setModifyBy(BigInteger.valueOf(1));
        mapper.updateProvider(provider);
        sqlSession.close();
    }

    @Test
    public void test2(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        Smbms_provider provider = new Smbms_provider();
        provider.setProName("sdfa");
        int id = mapper.insertProvider(provider);
        System.out.println(provider.getId());
        sqlSession.close();
    }

    @Test
    public void test1(){
        Smbms_address_mapper mapper = sqlSession.getMapper(Smbms_address_mapper.class);
        List<Address> mapperAddressAll = mapper.findAddressAll();
        for(Address address: mapperAddressAll){
            System.out.println(address);
        }
        sqlSession.close();
    }

}
