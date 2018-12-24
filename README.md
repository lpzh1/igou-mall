# OnelineShoppingMall-v1.0(Server-side)
## 基础知识

[Java数据结构和算法系列博客](https://www.cnblogs.com/ysocean/tag/Java%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E5%92%8C%E7%AE%97%E6%B3%95/)

* [Spring](https://spring.io/docs)

[Spring入门系列博客](https://www.cnblogs.com/ysocean/tag/Spring%E5%85%A5%E9%97%A8%E7%B3%BB%E5%88%97/)

* [Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html)

[SpringMVC入门系列博客](https://www.cnblogs.com/ysocean/tag/SpringMVC%E5%85%A5%E9%97%A8%E7%B3%BB%E5%88%97/)

[SpringMVC详解-jamesehng](https://blog.csdn.net/lpjishu/article/details/51759191)

[SpringMVC详解-半棵树](https://blog.csdn.net/banketree/article/details/80159345)

[SpringMVC详解(一)——SpringMVC的框架原理、架构简介、与mybatis整合和注解方式的使用](https://blog.csdn.net/u013087513/article/details/73290717)

[SpringMVC详解(二)——高级开发、数据回显、参数绑定集合、图片上传、json交互、validation校验、异常处理、RESTful支持、拦截器](https://blog.csdn.net/u013087513/article/details/73505211)

* [MyBatis](http://www.mybatis.org/mybatis-3/index.html)

[MyBatis详解系列博客](https://www.cnblogs.com/ysocean/tag/MyBatis%E8%AF%A6%E8%A7%A3%E7%B3%BB%E5%88%97/)

* [Generics](https://docs.oracle.com/javase/8/docs/technotes/guides/language/generics.html)

[Java泛型详解](https://blog.csdn.net/u012152619/article/details/47253811)

* [Enum](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

[Java 枚举(enum) 详解7种常见的用法](https://blog.csdn.net/qq_27093465/article/details/52180865)

[Java枚举使用详解](https://www.cnblogs.com/linjiqin/archive/2011/02/11/1951632.html)

[Java枚举详解](https://www.jianshu.com/p/6f2f5627c27d)

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
[对接支付宝](http://learning.happymmall.com/alipaydoc.html)

## 订单管理模块
通过常量，枚举提高扩展性、安全性


## Reference
>[Java从零到企业级电商项目实战-服务端](https://coding.imooc.com/class/96.html)