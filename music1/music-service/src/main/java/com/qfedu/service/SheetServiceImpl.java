package com.qfedu.service;

import com.qfedu.dao.TbSheetMapper;
import com.qfedu.pojo.TbSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    private TbSheetMapper tbSheetMapper;
    @Override
    public List<TbSheet> findAll() {
        return tbSheetMapper.selectByExample(null);
    }

    @Override
    public void insertSheet(String sheetName) {
        TbSheet tbSheet = new TbSheet();
        tbSheet.setSheetName(sheetName);
        tbSheetMapper.insert(tbSheet);
    }
}
