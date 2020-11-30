package com.qfedu.web;

import com.qfedu.pojo.TbSheet;
import com.qfedu.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sheet")
public class SheetController {
    @Autowired
    private SheetService sheetService;

    @RequestMapping("findAll")
    private List<TbSheet> findAll(){
        return sheetService.findAll();
    }

    //'http://localhost:8080/sheet/insertSheet?sheetName=' + inputSheetName,
    @RequestMapping("insertSheet")
    private void insertSheet(String sheetName){
        sheetService.insertSheet(sheetName);
    }
}
