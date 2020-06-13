# meeting

#### 介绍
该项目是一个我对微服务架构学习的项目，通过分版本开发，最终完成从零到整合目前主流中间件的完整框架

#### 软件架构
当前项目是一个基于dubbo的微服务前后端分离的项目架构计划使用的架构为：

1. 前端：vue,element-ui
2. 后端：
    
-     1. 基础架构：SpringBoot+Mybatis-Plus+Dubbo
-     2. 注册中心：zookeeper
-     3. 分布式事务框架：seata
-     4. 服务治理：sentinel
-     5. 接口文档：Swagger
-     6. 数据库：MySql
-     7. 消息中间件：RabbitMQ
-     8. 分布式缓存：Redis
-     9. 分库分表中间件：ShardingSphere-Jdbc




1.0.0 版本搭建影院项目业务基础框架的搭建（正在搭建中）
    2020-06-12 完成基本架构的搭建并编写dubbo微服务下的简单demo
    2020-06-13 计划完成引入Swagger和MybatisPlus框架并完成对应的demo样例（电脑出现故障暂停更新）

2.0.0 完成影院相关业务功能以及各模块Swagger

3.0.0 引入微服务并整合分布式事务框架，分库分表中间件

4.0.0 引入微服务相关治理解决方案

5.0.0 完成项目Docker+K8s的部署功能


