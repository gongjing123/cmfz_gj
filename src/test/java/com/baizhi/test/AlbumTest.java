package com.baizhi.test;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlbumTest extends  BaseTest {


    @Autowired
    private AlbumService albumService;

    @Test
    public  void  test1(){

        List<Album> byPage = albumService.findByPage(1, 20);
        System.out.println(byPage);
     /*   for (Album album : byPage) {
            System.out.println(album);
        }*/


    }
    @Test
    public  void  test2(){

        Long totals = albumService.findTotals();
        System.out.println(totals);


    }
}
