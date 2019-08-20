package com.payment.route;

import com.payment.product.AliProductService;
import com.payment.product.Product;
import com.payment.product.ProductService;
import com.payment.product.WeixinProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService{



    public void route(String productId){
        //限流
        //验签
        //获取支付产品
        if(productId.equals("1")){
          ProductService productService=new WeixinProductService();
          //执行支付请求
        }else{
            ProductService productService=new AliProductService();
            //执行支付请求
        }

    }

}
