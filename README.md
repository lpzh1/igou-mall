# OnelineShoppingMall-v1.0(Server-side)
## 基础知识
* Spring MVC

[详解1](https://blog.csdn.net/u013087513/article/details/73290717)，[详解2](https://blog.csdn.net/u013087513/article/details/73505211)

[详解3](https://blog.csdn.net/lpjishu/article/details/51759191)

[详解4](https://blog.csdn.net/banketree/article/details/80159345)

[详解5](https://www.cnblogs.com/ysocean/p/7376596.html)，[详解6](https://www.cnblogs.com/ysocean/p/7375405.html#_label0)



## 数据库表结构设计
引擎-[InnoDB](https://zh.wikipedia.org/wiki/InnoDB)

[『浅入浅出』MySQL 和 InnoDB](https://draveness.me/mysql-innodb)

用户表用BTREE的方式将username设置为[唯一索引](https://zh.wikipedia.org/wiki/%E5%85%B3%E7%B3%BB%E9%94%AE)

[二叉树](https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%85%83%E6%90%9C%E5%B0%8B%E6%A8%B9)->[平衡树](https://zh.wikipedia.org/wiki/%E5%B9%B3%E8%A1%A1%E6%A0%91)-[B树](https://zh.wikipedia.org/wiki/B%E6%A0%91)->[B+树](https://zh.wikipedia.org/wiki/B%2B%E6%A0%91)

[B-树，B+树与B*树的优缺点比较](https://blog.csdn.net/bigtree_3721/article/details/73632405)

分类表要考虑递归和递归结束条件，可以通过设置parent_id来说明根节点
## 用户模块
防止越权，密码加密，Guava缓存，高复用对象的抽象封装

## 分类管理模块

## 商品管理模块

## 购物车模块

## 收货地址管理模块

## 支付模块

## 订单管理模块


## Reference
>[Java从零到企业级电商项目实战-服务端](https://coding.imooc.com/class/96.html)