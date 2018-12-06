# 韵家商城
这是一个电商网站项目，采用SOA架构开发，Maven管理项目。主要包括前台系统、后台系统、搜索系统、单点登录系统、购物车系统、订单系统六大模块。（前台系统、后台系统、搜索系统已开发完成，单点登录系统、购物车系统和订单系统正在开发中）。

> 源码：[github](https://github.com/ChuiShengZhang/yunjia)



---

## 项目技术架构
> - Spring
> - Mybatis
> - SpringMVC
> - Nginx(反向代理和http图片服务器)
> - FastDFS(分布式文件系统，用于图片存储)
> - ActiveMQ(消息队列，同步solr索引库)
> - redis(缓存)
> - solr(搜索系统框架)
> - dubbo(系统间通信)
## 项目结构目录
- yunjia-parent(父工程-版本管理)
    - yunjia-common(公共模块)
    - yunjia-manager(后台系统父工程)
        - yunjia-manager-pojo
        - yunjia-manager-dao
        - yunjia-manager-interface
        - yunjia-manager-service
    - yunjia-content(内容管理系统父工程)
        - yunjia-content-interface
        - yunjia-content-service
    - yunjia-search(搜索系统父工程)
        - yunjia-search-interface
        - yunjia-search-service
    - yunjia-portal-web(前台系统表现层)
    - yunjia-manager-web(后台系统表现层)
    

---
## 运行准备
该项目依赖的服务器都搭建在同一台服务器，公网ip为47.100.214.167。
### 运行环境
项目运行需要有jdk环境，maven环境。
### 端口列表

project | tomcat-port | dubbo-port
---|--- | ---
yunjia-manager | 8080 | 20880 hessian:20890
yunjia-manager-web | 8081 |
yunjia-portal | 8083 |
yunjia-content | 8084 | 20881
yunjia-search | 8085 | 20882
yunjia-search-web | 8086
yunjia-item | 8087 | 20883
yunjia-item-web | 8088 |
注：如需修改可在各工程的pom.xml文件中修改。


### 运行步骤
1. 打开eclipse->import->existing maven project,选择yunjia-parent导入。
2. 选择项目，运行run as->maven build...。
3. 输入clean tomcat7:run。
4. 依次运行已开发完成的系统。(注：因项目使用的是dubbo微服务框架通信，采用异步通信，先启动表现层会报错，服务层启动完毕后可正常使用)。
