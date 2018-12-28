**OnelineShoppingMall Server-side v1.0**

## 数据库表结构设计
引擎-[InnoDB](https://zh.wikipedia.org/wiki/InnoDB)

[『浅入浅出』MySQL 和 InnoDB](https://draveness.me/mysql-innodb)

用户表用BTREE的方式将username设置为[唯一索引](https://zh.wikipedia.org/wiki/%E5%85%B3%E7%B3%BB%E9%94%AE)

[二叉树](https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%85%83%E6%90%9C%E5%B0%8B%E6%A8%B9)->[平衡树](https://zh.wikipedia.org/wiki/%E5%B9%B3%E8%A1%A1%E6%A0%91)-[B树](https://zh.wikipedia.org/wiki/B%E6%A0%91)->[B+树](https://zh.wikipedia.org/wiki/B%2B%E6%A0%91)

[B-树，B+树与B*树的优缺点比较](https://blog.csdn.net/bigtree_3721/article/details/73632405)

分类表要考虑递归和递归结束条件，可以通过设置parent_id来说明根节点
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
[POJO、BO、VO抽象模型](http://www.cnblogs.com/yxnchinahlj/archive/2012/02/24/2366110.html)

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

