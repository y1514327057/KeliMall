package com.yts.keliproduct;

import com.yts.Keli.product.KeliProductApplication;
import com.yts.Keli.product.entity.BrandEntity;
import com.yts.Keli.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KeliProductApplication.class)
class KeliProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

}
