package com.edu.test;

import com.edu.mapper.NewsMapper;
import com.edu.mapper.Smbms_provider_mapper;
import com.edu.pojo.News;
import com.edu.pojo.NewsCnd;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class NewsTest {
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
    public void test4(){

        List<News> list = new ArrayList<>();

        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        mapper.updateNews("首款天玑9000手机正式官宣，3月18日开卖，售价5799元，期待吗？");
        sqlSession.commit();

    }


    @Test
    public void test3(){

        List<News> list = new ArrayList<>();
        News news = new News();
        System.out.println(news.getId());
        news.setContent("adsf");
        list.add(news);
        list.add(new News());
        list.add(new News());
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        mapper.insertNews(list);
        sqlSession.commit();

    }


    @Test
    public void test2(){

        List<String> list = new ArrayList<>();
        list.add("第一观察｜读懂习近平总书记2022年两会时间");
        list.add("格式转换大全 教你玩转PDF、WORD、PPT、TXT！");

        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        List<News> news = mapper.findNewsByIn(list);
        System.out.println(news);
    }

    @Test
    public void test1(){
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        List<News> news = mapper.findNewsByTSE(new NewsCnd());
        System.out.println(news);
    }

}
