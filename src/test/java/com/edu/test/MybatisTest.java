package com.edu.test;

import com.edu.mapper.Smbms_address_mapper;
import com.edu.mapper.Smbms_provider_mapper;
import com.edu.mapper.StudentMapper;
import com.edu.pojo.MYFindByProAddressAndProDesc;
import com.edu.pojo.Smbms_address;
import com.edu.pojo.Smbms_provider;
import com.edu.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

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
    public void test5(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        int num = mapper.findNumByProName("无锡喜源坤商行");
        System.out.println(num);
    }

    @Test
    public void test4(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("num",10000);
        List<Map<String,Object>> smbms_providerList = mapper.findByTotalPrice(map);
        for(Map address: smbms_providerList){
            System.out.println(address);
        }
    }

    @Test
    public void test3(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("proAddress","北京");
        map.put("proDesc","五粮液");
        List<Map<String,Object>> smbms_providerList = mapper.findByProAddressAndProDesc(map);
        for(Map address: smbms_providerList){
            System.out.println(address);
        }
    }


    @Test
    public void test2(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        List<Map<String,Object>> smbms_providerList = mapper.findByProAddress("北京");
        for(Map address: smbms_providerList){
            System.out.println(address);
        }
    }

    @Test
    public void test1(){
        Smbms_provider_mapper mapper = sqlSession.getMapper(Smbms_provider_mapper.class);
        List<Map<String,Object>> smbms_providerList = mapper.findByProCode("HB_GYS001");
        for(Map address: smbms_providerList){
            System.out.println(address);
        }
    }

    @Test
    public void test0() throws IOException {
        //1. 加载mybatis核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2. 创建SqlSession工厂 build
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3. 创建绘画
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.加载映射接口
        Smbms_address_mapper mapper = sqlSession.getMapper(Smbms_address_mapper.class);
        //5.运行fandAll方法
        List<Smbms_address> studentList = mapper.findAll();
//        List<Student> selectList = sqlSession.selectList("StudentMapper.findAll");
        //打印数据
        for(Smbms_address address: studentList){
            System.out.println(address);
        }

        //关闭绘画资源
        sqlSession.close();

    }
}
