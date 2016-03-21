package jp.gr.java.conf.ulexite.spring.multicmp.service;

import org.springframework.stereotype.Service;

@Service("increment")
public class CountServiceIncrement implements CountService {
    private int counter;

    public CountServiceIncrement() {
        counter = 1;
    }

    @Override
    public Count count() {
        Count count = new Count(counter);
        counter++;
        return count;
    }
}
