项目架构：Spring Boot + Log4j2 + Hibernate

项目文件夹介绍：
1）libs,  项目依赖的本地第三方jar包存放位置(既Maven仓库上没有的jar包，只能网上找其它资源下载的) <br>
2）src/main/java，代码存放路径 <br>
3）src/main/resources，项目资源文件存放路径 <br>
4）src/main/profiles，多个环境（开发dev、测试test、生产prod）配置文件存放路径 <br>
5）src/test，测试代码存放路径

注意：
项目依赖的本地第三方jar包(既Maven仓库上没有的jar包，只能网上找其它资源下载的)，放在了libs\路径之后，还要在pom中配置，如下：
		<!-- 添加 ODBC 驱动包 -->
		<dependency>
			<groupId>com.oracle</groupId>
			<artifactId>ojdbc8</artifactId>
			<scope>system</scope>
			<systemPath>${project.basedir}/libs/ojdbc8.jar</systemPath>
            <version>8</version> <!-- 随便配置的版本号，不配置编译打包等会报错 -->
		</dependency>
