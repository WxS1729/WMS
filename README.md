## wms简介
支持lodop和网页打印入库单、出库单。
* 前端采用Vue、Element UI
* 后端采用Spring Boot、Spring Security、Redis & Jwt。
* 权限认证使用Jwt，支持多终端认证系统。
* 支持加载动态权限菜单，多方式轻松权限控制。
* 高效率开发，使用代码生成器可以一键生成前后端代码。

## 代码自动生成
修改application.yml文件中的backPath和frontPath路径。
backPath:为后端项目路径 
frontPath:为前端项目路径

## 本地运行文档
https://docs.ichengle.top/wms/open/run.html
## 系统部署文档
https://docs.ichengle.top/wms/open/ops.html

## wms功能
1. 首页：库存预警与到期提醒、基础数据报表展示
2. 仓库/库区：管理维护仓库基础数据
3. 物料：管理维护物料基础数据
4. 客户/供应商/承运商：管理维护联系人基础数据
5. 入库：创建入库单后包括如下几个状态：未发货、在途（已发货未入库）、部分入库、作废、入库完成，入库类型包括：采购入库、外协入库、退货入库，入库单支持lodop和网页打印
6. 出库：创建出库单后包括如下几个状态：未发货、部分发货、已发货、作废，入库类型包括：销售出库、外协出库、调拨出库，出库单支持lodop和网页打印
7. 移库：创建移库单后包括如下几个状态：未操作、部分移动、操作完毕、作废
8. 库存看板：查看当前物料库存数量
9. 库存记录：查看当前物料库存操作记录
10. 库存盘点：已完成
11. 库存月结：已完成
12. 各类报表: 已完成
## 状态流转
#### 入库状态流转
![入库状态流转](https://oscimg.oschina.net/oscnet/up-6bdb5ad6d8ab236f763300b71cf175d9a99.jpg)
#### 出库状态流转
![出库状态流转](https://oscimg.oschina.net/oscnet/up-55cad3f077f914e357efeaae0b3feecf942.jpg)

## 演示图
![首页](https://oscimg.oschina.net/oscnet/up-89f751967b4145f7da92e23536bf231fbe8.jpg)
![支持两种打印方式](https://oscimg.oschina.net/oscnet/up-6daf90ef19571c7f0e7641ae59c403d8272.jpg)
![lodop打印](https://oscimg.oschina.net/oscnet/up-146d2105ae31a27e497323ad19f8bd0d7bd.jpg)
![网页打印](https://oscimg.oschina.net/oscnet/up-5664440042861199d1f3e60928e0700a9ce.jpg)
![仓库列表](https://oscimg.oschina.net/oscnet/up-a00eb79bee48e481249a12cb5e6c476aaa3.jpg)
![库存看板](https://oscimg.oschina.net/oscnet/up-78990915dfba902384ed4b09e3dc0f0fe05.jpg)

