package service;

import org.springframework.stereotype.Service;

@Service
public class helloServiceImpl implements helloService{
    public void hello() {
        System.out.println("hello");
    }
}
