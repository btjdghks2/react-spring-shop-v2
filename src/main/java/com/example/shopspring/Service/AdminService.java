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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminService {

    private final OuterRepository outerRepository;
    private final PantsRepository pantsRepository;
    private final ShoseRepository shoseRepository;
    private final TshirtRepository tshirtRepository;

    //admin 등록
    @Transactional
    public OuterEntity Outersave(OuterEntity outerEntity) {
        return outerRepository.save(outerEntity);
    }

    @Transactional
    public PantsEntity Pantsave(PantsEntity pantsEntity) {
        return pantsRepository.save(pantsEntity);
    }

    @Transactional
    public ShoseEntity Shosesave(ShoseEntity shoseEntity) {
        return shoseRepository.save(shoseEntity);
    }

    @Transactional
    public TshirtEntity Tshirtsave(TshirtEntity tshirtEntity) {
        return tshirtRepository.save(tshirtEntity);
    }
    //admin 삭제

    @Transactional
    public String outerdelete(Long pnumber) {
        outerRepository.deleteById(pnumber);
        return "outer delete ok";
    }
    @Transactional
    public String pantsdelete(Long pnumber) {
        pantsRepository.deleteById(pnumber);
        return "pants delete ok";
    }
    @Transactional
    public String shosedelete(Long pnumber) {
        shoseRepository.deleteById(pnumber);
        return "shose delete ok";
    }
    @Transactional
    public String tshirtdelete(Long pnumber) {
        tshirtRepository.deleteById(pnumber);
        return "tshirt delete ok";
    }

    //디테일 페이지

    @Transactional(readOnly = true)
    public OuterEntity OuterDetail(Long pnumber) {
        return outerRepository.findById(pnumber)
                .orElseThrow(() -> new IllegalArgumentException("id를 확인하세요"));
    }

    @Transactional(readOnly = true)
    public Object PantsDetail(Long pnumber) {
        return pantsRepository.findById(pnumber)
                .orElseThrow(() -> new IllegalArgumentException("id를 확인하세요"));
    }

    @Transactional(readOnly = true)
    public Object ShoseDetail(Long pnumber) {
        return shoseRepository.findById(pnumber)
                .orElseThrow(() -> new IllegalArgumentException("id를 확인하세요"));
    }

    @Transactional(readOnly = true)
    public Object TshirtDetail(Long pnumber) {
        return tshirtRepository.findById(pnumber)
                .orElseThrow(() -> new IllegalArgumentException("id를 확인하세요"));
    }

    public List<OuterEntity> OuterIndex() {

        return outerRepository.findAll();
    }

    public List<PantsEntity> PantsIndex() {

        return pantsRepository.findAll();
    }

    public List<ShoseEntity> ShoseIndex() {

        return shoseRepository.findAll();
    }
    public List<TshirtEntity> TshirtIndex() {

        return tshirtRepository.findAll();
    }



}
