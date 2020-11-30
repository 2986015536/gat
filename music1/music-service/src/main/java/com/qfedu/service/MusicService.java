package com.qfedu.service;

import com.qfedu.pojo.TbMusic;

import java.util.List;

public interface MusicService {
    List<TbMusic> findAll();
    TbMusic findById(String musicId);

    List<TbMusic> search(String keyword);

    TbMusic prevSong(String musicId);

    TbMusic nextSong(String musicId);

}
