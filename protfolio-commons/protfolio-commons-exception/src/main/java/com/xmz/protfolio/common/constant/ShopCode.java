package com.xmz.protfolio.common.constant;

/**
 * @author Think
 */

public enum ShopCode {
    /**
     * 正确
     */
    PROTFOLIO_SUCCESS(true, 1, "正确"),
    /**
     * 错误
     */
    PROTFOLIO_FAIL(false, 0, "错误"),
    /**
     *  请求参数有误
     */
    PROTFOLIO_REQUEST_PARAMETER_VALID(false, -1, "请求参数有误"),

    /**
     * 手机号不能重复
     */
    USER_REGISTER_STATUS_PHONE(false, 100001, "手机号不能重复"),
    /**
     * 密码必须6 - 20 为之间
     */
    USER_REGISTER_STATUS_PASSWORD(false, 100002, "密码必须6 - 20 为之间"),
    /**
     * 两次密码不一致
     */
    USER_REGISTER_STATUS_REPPASSWORD(false, 100003, "两次密码不一致"),
    /**
     * 验证码错误
     */
    USER_REGISTER_STATUS_AUTHCODE(false, 100004, "验证码错误"),
    /**
     *资金账号错误
     */
    USER_LOGIN_STATUS_USERNAME(false, 100102, "资金账号错误"),
    /**
     * 密码错误
     */
    USER_LOGIN_STATUS_PASWORD(false, 100102, "密码错误"),
    /**
     * 手机号错误
     */
    USER_LOGIN_STATUS_PHONE(false, 100103, "手机号错误"),
    /**
     * 连续5次密码错误，账号冻结
     */
    USER_LOGIN_STATUS_FREEZE(false, 100104, "连续5次密码错误，账号冻结"),
    /**
     * 客户姓名错误
     */
    USER_LOGIN_STATUS_NAME(false, 100105, "客户姓名错误"),
    /**
     * 身份证号错误
     */
    USER_INFO_STATUS_IDUSER(false, 100106, "身份证号错误"),
    /**
     * 实名验证失败
     */
    USER_INFO_STATUS_NAME_FAIL(false, 100201, "实名验证失败"),
    /**
     * 上传身份证失败
     */
    USER_INFO_STATUS_UPLOAD_FAIL(false, 100202, "上传身份证失败"),
    /**
     * 身份证审核不通过
     */
    USER_INFO_STATUS_INUSER_FAIL(false, 100203, "身份证审核不通过"),
    /**
     * 交易密码不一致
     */
    USER_INFO_STATUS_NOT_DEAL_PASSWORD(false, 100204, "交易密码不一致"),
    /**
     * 资金密码不一致
     */
    USER_INFO_STATUS_NOT_MONEY_PASSWORD(false, 100205, "资金密码不一致"),
    /**
     * 资金密码必须6位
     */
    USER_INFO_STATUS_DEAL_PASSWORD_FAIL(false, 100206, "资金密码必须6位"),
    /**
     * 交易密码必须6位
     */
    USER_INFO_STATUS_MONEY_PASSWORD_FAIL(false, 100207, "交易密码必须6位"),
    /**
     * 旧交易密码错误
     */
    USER_INFO_STATUS_OLD_DEAL_PASSWORD(false, 100208, "旧交易密码错误"),
    /**
     * 旧资金密码错误
     */
    USER_INFO_STATUS_OLD_MONEY_PASSWORD(false, 100209, "旧资金密码错误"),
    /**
     * 旧手机号错误
     */
    USER_INFO_STATUS_PHONE(false, 100210, "旧手机号错误"),
    /**
     * 银行卡密码错误
     */
    USER_INFO_STATUS_CARD(false, 100211, "银行卡密码错误"),
    /**
     * 视频上传失败
     */
    USER_INFO_STATUS_VIDEO(false, 100212, "视频上传失败"),
    /**
     * 修改信息失败
     */
    USER_INFO_STATUS_UPDATE_INFO(false, 100213, "修改信息失败"),
    /**
     * 银行卡转账失败
     */
    USER_INFO_STATUS_TRANSFER_ACCOUNTS(false, 100301, "银行卡转账失败"),
    /**
     * 银行卡绑定失败
     */
    USER_INFO_STATUS_CARD_BIND(false, 100301, "银行卡绑定失败"),

    /**
     * 管理员编号错误
     */
    ADMIN_LOGIN_STATUS_ID(false, 200001, "管理员编号错误"),
    /**
     * 管理员密码错误
     */
    ADMIN_LOGIN_STATUS_PASSWORD(false, 200002, "管理员密码错误"),


    /**
     * 购买证券失败
     */
    BONDS_BUY_STATUS_FAIL(false, 300001, "购买证券失败"),
    /**
     * 余额不足
     */
    BONDS_BUY_STATUS_MONEY(false, 300002, "余额不足"),
    /**
     * 购买金额非法
     */
    BONDS_BUY_STATUS_MONEY_FAIL(false, 300003, "购买金额非法"),
    /**
     * 订单付款失败
     */
    BONDS_BUY_STATUS_BOND_FAIL(false, 300004, "订单付款失败"),
    /**
     * 订单参数有误
     */
    BONDS_BUY_STATUS_ORDER__VALID(false, 300005, "订单参数有误"),
    /**
     * 订单付款失败
     */
    BONDS_BUY_STATUS_ORDER__FAIL(false, 300006, "订单付款失败"),
    /**
     * 卖出股票失败
     */
    BONDS_SELL_STATUS_FAIL(false, 300101, "卖出股票失败"),
    /**
     *订单生成失败
     */
    BONDS_ORDER_STATUS_FAIL(false, 300102, "订单生成失败"),
    /**
     * 订单不存在
     */
    BONDS_ORDER_STATUS_NOT(false, 300103, "订单不存在"),

    /**
     * 注册成功
     */
    user_register_success(true, 500001, "注册成功"),
    /**
     * 登录成功
     */
    user_login_success(true, 500002, "登录成功"),
    /**
     * 修改成功
     */
    user_update_success(true, 500003, "修改成功"),
    /**
     * 设置密码成功
     */
    user_password_success(true, 500004, "设置密码成功"),
    /**
     * 开户成功
     */
    user_open_success(true, 500005, "开户成功"),
    /**
     * 成功买入证券
     */
    bonds_buy_success(true, 500006, "成功买入证券"),
    /**
     * 成功卖出证券
     */
    bonds_sell_success(true, 500007, "成功卖出证券"),
    /**
     * 订单生成成功
     */
    order_create_success(true, 500008, "订单生成成功");

    Boolean success;
    Integer code;
    String message;

    ShopCode() {

    }

    ShopCode(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ShopCode{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
