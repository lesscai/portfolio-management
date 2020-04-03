package com.xmz.protfolio.common.exception;


import com.xmz.protfolio.common.constant.ShopCode;

/**
 * 自定义异常
 */
class CustomerException extends RuntimeException{

    private ShopCode shopCode;

    public CustomerException(ShopCode shopCode) {
        this.shopCode = shopCode;
    }
}
