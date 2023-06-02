package com.example.shopspring.Service;

import com.example.shopspring.Entitylist.CategoryEntity.OuterEntity;
import com.example.shopspring.Entitylist.CategoryEntity.PantsEntity;
import com.example.shopspring.Entitylist.CategoryEntity.ShoseEntity;
import com.example.shopspring.Entitylist.CategoryEntity.TshirtEntity;
import com.example.shopspring.Respositorylist.CategoryRepository.OuterRepository;
import com.example.shopspring.Respositorylist.CategoryRepository.PantsRepository;
import com.example.shopspring.Respositorylist.CategoryRepository.ShoseRepository;
import com.example.shopspring.Respositorylist.CategoryRepository.TshirtRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TotalService {

    private final OuterRepository outerRepository;
    private final PantsRepository pantsRepository;
    private final ShoseRepository shoseRepository;
    private final TshirtRepository tshirtRepository;

    public List<OuterEntity> OuterIndexLogic() {

        return outerRepository.findAll();
    }

    public List<PantsEntity> PantsIndexLogic() {
     return pantsRepository.findAll();
    }

    public List<ShoseEntity> ShoseIndexLogic() {
        return shoseRepository.findAll();
    }
    public List<TshirtEntity> TshirtIndexLogic() {
        return tshirtRepository.findAll();
    }

    public OuterEntity OuterDetailLogic(Long Pnumber) {
        return outerRepository.findById(Pnumber).orElseThrow(()-> new IllegalArgumentException("잘못된 상품입니다"));
    }

    public PantsEntity PantsDetailLogic(Long Pnumber) {
        return pantsRepository.findById(Pnumber).orElseThrow(()-> new IllegalArgumentException("잘못된 상품입니다"));
    }

    public ShoseEntity ShoseDetailLogic(Long Pnumber) {
        return shoseRepository.findById(Pnumber).orElseThrow(()-> new IllegalArgumentException("잘못된 상품입니다"));
    }

    public TshirtEntity TshirtDetailLogic(Long Pnumber) {
        return tshirtRepository.findById(Pnumber).orElseThrow(()-> new IllegalArgumentException("잘못된 상품입니다"));
    }
}
