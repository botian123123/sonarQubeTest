@echo off
echo Spring Boot Demo 启动脚本
echo ========================

echo 检查Java环境...
java -version
if %errorlevel% neq 0 (
    echo 错误: 未找到Java环境，请确保已安装Java 17或更高版本
    pause
    exit /b 1
)

echo.
echo 检查Maven环境...
mvn --version
if %errorlevel% neq 0 (
    echo 错误: 未找到Maven，请确保已安装Maven 3.6或更高版本
    echo 您可以从 https://maven.apache.org/download.cgi 下载Maven
    pause
    exit /b 1
)

echo.
echo 开始构建和运行Spring Boot应用程序...
echo 这可能需要几分钟时间下载依赖项...
echo.

mvn clean spring-boot:run

pause
