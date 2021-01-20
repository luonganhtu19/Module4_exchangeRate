package com.TuMangement.Exchange.Controller;

import com.TuMangement.Exchange.Model.Money;
import com.TuMangement.Exchange.Model.MoneyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exchange")
public class controllerExchange {
    @Autowired
    private Money money;
   @GetMapping
   public ModelAndView demo(){
       ModelAndView modelAndView=new ModelAndView("exchangeRate");
       modelAndView.addObject("money",money);
       return modelAndView;
   }
   @PostMapping
    public ModelAndView demo(@ModelAttribute Money money ){
        ModelAndView modelAndView=new ModelAndView("exchangeRate");
        MoneyType money1=(MoneyType) money;
        if (money1==null){
        }
        else if (money1.getNameMoney().equals("usd")){
            money1.setExchangeRate(23000*money1.getQuantityMoney());
        }else {
            money1.setExchangeRate(money1.getQuantityMoney()/23000);
        }
        modelAndView.addObject("money",(Money) money1);
        return modelAndView;
    }
}
