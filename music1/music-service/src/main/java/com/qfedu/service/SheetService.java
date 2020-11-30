package com.qfedu.service;

import com.qfedu.pojo.TbSheet;

import java.util.List;

public interface SheetService {
    List<TbSheet> findAll();

    void insertSheet(String sheetName);

}
