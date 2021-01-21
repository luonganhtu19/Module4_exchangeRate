package com.TuMangement.Exchange.Controller;

import com.TuMangement.Exchange.Model.MoneyType;
import com.TuMangement.Exchange.service.IExchange;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exchange")
public class controllerExchange {
    @Autowired
    private IExchange iExchange;
    @GetMapping
    public ModelAndView exchangeHome(){
        ModelAndView modelAndView=new ModelAndView("exchangeRate");
        modelAndView.addObject( "moneyType",new MoneyType());
        return modelAndView;
    }
    @PostMapping
    public ModelAndView exchange(@ModelAttribute MoneyType moneyType){
        ModelAndView modelAndView=new ModelAndView("exchangeRate");
        modelAndView.addObject("result", iExchange.exchange(moneyType));
        modelAndView.addObject(moneyType);
        return modelAndView;
    }
}
