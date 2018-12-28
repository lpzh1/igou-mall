**OnelineShoppingMall Server-side v1.0**

## 数据库表结构设计

## 用户模块
通过校验方法防止越权(此处为硬编码，可以通过SpringMVC拦截器重构)

MD5密码加密

Guava缓存存储忘记密码时重置密码的Token

高复用对象ServerResponse的抽象封装

## 分类管理模块
递归查询分类算法

复杂对象重排

无限层级设计

## 商品管理模块
POJO、BO、VO抽象模型

基于pagehelper的动态分页

FTP对接、富文本上传

## 购物车模块
BigDecimal解决浮点计算丢失精度

## 收货地址管理模块

Spring MVC 对象绑定

MyBatis自动生成主键
## 支付模块
对接支付宝

## 订单管理模块
通过常量，枚举提高扩展性、安全性

