package com.hbp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄炳培
 * @since 2021/7/2
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("扣减库存");
        return "扣减库存";
    }
}
