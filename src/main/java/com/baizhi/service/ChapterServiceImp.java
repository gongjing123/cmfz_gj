package com.baizhi.service;

import com.baizhi.dao.ChapterDAO;
import com.baizhi.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImp implements ChapterService {

    @Autowired
    private ChapterDAO chapterDAO;

    @Override
    public void add(Chapter chapter) {
        System.out.println("--------"+chapter);
        chapterDAO.insert(chapter);
        System.out.println("------------------------");

    }
}
