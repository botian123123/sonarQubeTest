# Spring Boot Demo 项目

这是一个简单的Spring Boot演示应用程序，展示了Spring Boot的基本功能和特性。

## 功能特性

-  **Web界面**: 使用Thymeleaf模板引擎构建的响应式Web界面
-  **REST API**: 提供RESTful API接口，支持JSON数据交换
-  **快速开发**: 基于Spring Boot的快速开发和部署
-  **现代UI**: 使用Bootstrap 5构建的美观界面

## 技术栈

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Web MVC**
- **Thymeleaf** (模板引擎)
- **Bootstrap 5** (前端框架)
- **Maven** (构建工具)

## 项目结构

`
src/
 main/
    java/
       com/example/demo/
           SpringBootDemoApplication.java
           controller/
               HomeController.java
    resources/
        application.yml
        templates/
            index.html
            hello.html
 test/
     java/
         com/example/demo/
             SpringBootDemoApplicationTests.java
`

## 快速开始

### 前置要求

- Java 17 或更高版本
- Maven 3.6 或更高版本

### 运行应用程序

1. 克隆或下载项目
2. 在项目根目录下运行：
   `ash
   mvn spring-boot:run
   `
3. 打开浏览器访问：http://localhost:8080

### 构建应用程序

`ash
mvn clean package
`

构建完成后，在 	arget 目录下会生成可执行的JAR文件。

## API接口

### 获取问候信息
- **URL**: /api/hello
- **方法**: GET
- **参数**: 
ame (可选，默认为"World")
- **示例**: http://localhost:8080/api/hello?name=张三

### 获取系统信息
- **URL**: /api/info
- **方法**: GET
- **返回**: 应用程序和系统信息

## 页面路由

- / - 首页
- /hello - Hello页面，支持自定义姓名参数
- /api/hello - API问候接口
- /api/info - 系统信息接口

## 开发说明

- 项目使用Spring Boot DevTools，支持热重载
- 模板缓存已禁用，便于开发调试
- 日志级别设置为INFO，Web层设置为DEBUG

## 许可证

MIT License
