package jp.gr.java.conf.ulexite.spring.multicmp.service;

import org.springframework.stereotype.Service;

@Service("double")
public class CountServiceDouble implements CountService {
    private int counter;

    public CountServiceDouble() {
        counter = 1;
    }

    @Override
    public Count count() {
        Count count = new Count(counter);
        counter = counter * 2;
        return count;
    }
}
