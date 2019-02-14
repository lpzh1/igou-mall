# 电商网站（服务端）

本项目是一套服务端的网上购物系统，包含用户 / 分类 / 商品 / 购物车订单 / 收货地址 / 支付 七个模块

主要技术为 Spring / SpringMVC / MyBatis / Redis / Nginx / Tomcat

#简介
![version1.0](https://img.shields.io/badge/mall-v1.0-brightgreen.svg) 

**主要集成了服务端的基本功能**

![FunctionList](./FunctionList.png)

用户模块
横向越权、纵向越权、
MD5明文加密、Guava缓存
高复用服务响应对象的封装

分类模块
递归算法
复杂对象排重
无限层级树结构设计

商品模块
POJO、BO、VO抽象模型
高效分页及动态排序
FTP服务对接、富文本上传

购物车模块
商品总价计算复用封装
高复用的逻辑方法封装

订单模块
安全漏洞解决方案
订单号生成规则
常量、枚举设计

收货地址
同步获取自增主键
数据绑定的对象绑定

支付模块
支付宝支付流程与集成
二维码生成，扫码支付


![version2.0](https://img.shields.io/badge/mall-v2.0-blue.svg)

**Tomcat集群 / Nginx负载均衡 / Redis分布式**

Lombok 注解

Maven 环境隔离

Nginx + Tomcat集群

Redis 存储 Session的原生实现单点登录 /  Spring Session 框架集成实现单点登录

SpringMVC 全局异常处理 + 拦截器实现权限统一校验 + 部分接口改为RESTful实现

Spring Schedule + Redis 分布式锁实现分布式场景下的定时关单 / Redisson 框架集成实现关单

