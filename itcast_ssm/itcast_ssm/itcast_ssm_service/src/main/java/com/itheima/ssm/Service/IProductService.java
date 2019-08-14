package com.itheima.ssm.Service;
import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
