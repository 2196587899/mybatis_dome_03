package com.edu.mapper;

import com.edu.pojo.News;
import com.edu.pojo.NewsCnd;

import java.util.List;

public interface NewsMapper {
    List<News> findNewsByTSE(NewsCnd newsCnd);
    List<News> findNewsByIn(List<String> list);
    void insertNews(List<News> list);
    void updateNews(String str);
}
