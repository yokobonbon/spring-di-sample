package jp.gr.java.conf.ulexite.spring.multicmp.controller;

import jp.gr.java.conf.ulexite.spring.multicmp.service.Count;
import jp.gr.java.conf.ulexite.spring.multicmp.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count")
public class CountRestController {
    @Autowired
    @Qualifier("double")
    private CountService service;

    @RequestMapping(method = RequestMethod.GET)
    public Count getCount() {
        return service.count();
    }
}
