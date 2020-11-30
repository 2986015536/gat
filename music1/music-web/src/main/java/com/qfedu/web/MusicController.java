package com.qfedu.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.pojo.TbMusic;
import com.qfedu.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("findAll")
    private List<TbMusic> findAll(){
        return musicService.findAll();
    }

    @RequestMapping("findById")
    private TbMusic findById(String musicId){
        return musicService.findById(musicId);
    }

    @RequestMapping("search")
    private List<TbMusic> search(String keyword) {
        return musicService.search(keyword);
    }

    //http://localhost:8080/music/prevSong?musicId=' + currentId,//上一首
    @RequestMapping("prevSong")
    private TbMusic prevSong(String musicId){
        return musicService.prevSong(musicId);
    }


    //http://localhost:8080/music/nextSong?musicId=' + currentId,//下一首
    @RequestMapping("nextSong")
    private TbMusic nextSong(String musicId){
        return musicService.nextSong(musicId);
    }

    //分页
    @RequestMapping("findPage")
    private PageInfo findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "2") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);

        List<TbMusic> all = musicService.findAll();

        PageInfo<TbMusic> pageInfo = new PageInfo<TbMusic>(all);
        return pageInfo;
    }

}