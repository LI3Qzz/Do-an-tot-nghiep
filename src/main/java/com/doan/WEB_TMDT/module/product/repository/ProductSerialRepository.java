package com.doan.WEB_TMDT.module.product.repository;

import com.doan.WEB_TMDT.module.product.entity.Product;
import com.doan.WEB_TMDT.module.product.entity.ProductDetail;
import com.doan.WEB_TMDT.module.product.entity.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ProductSerialRepository extends JpaRepository<ProductDetail, Long> {
    Optional<ProductDetail> findBySerialNumber(String serialNumber);
    List<ProductDetail> findByProductAndStatus(Product product, ProductStatus status);
    long countByProductAndStatus(Product product, ProductStatus status);
}
