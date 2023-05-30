package com.example.shopspring.Service;

import com.example.shopspring.Entitylist.PrizeEntity;
import com.example.shopspring.Respositorylist.PrizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrizeService {

    @Autowired
    private PrizeRepository prizeRepository;

    public PrizeEntity saved() {
        return ;
    }
}
