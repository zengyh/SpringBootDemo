项目架构：Spring Boot + Log4j2 + Hibernate

项目文件夹介绍：<br>
1. libs，项目依赖的本地第三方jar包存放位置(既Maven仓库上没有的jar包，只能网上找其它资源下载的) <br>
2. src/main/java，代码存放路径 <br>
  2.1 codex.terry.beanconfig Bean实例注册<br>
     &nbsp;&nbsp;&nbsp;&nbsp;2.1.1 codex.terry.beanconfig.FilterConfiguration 注册Filter过滤器<br>
  2.2 codex.terry.controller Controller目录<br>
  2.3 codex.terry.entity 实体类目录<br>
  2.4 codex.terry.filter 过滤器目录<br>
3. src/main/resources，项目资源文件存放路径 <br>
4. src/main/profiles，多个环境（开发dev、测试test、生产prod）配置文件存放路径 <br>
5. src/test，测试代码存放路径

注意：
项目依赖的本地第三方jar包(既Maven仓库上没有的jar包，只能网上找其它资源下载的)，放在了libs\路径之后，还要在pom中配置，如下：<br>
		&lt;!-- 添加 ODBC 驱动包 --&gt;<br>
		&lt;dependency&gt;<br>
			&lt;groupId&gt;com.oracle&lt;/groupId&gt;<br>
			&lt;artifactId&gt;ojdbc8&lt;/artifactId&gt;<br>
			&lt;scope&gt;system&lt;/scope&gt;<br>
			&lt;systemPath&gt;${project.basedir}/libs/ojdbc8.jar&lt;/systemPath&gt;<br>
            &lt;version&gt;8&lt;/version&gt; &lt;!-- 随便配置的版本号，不配置编译打包等会报错 --&gt; <br>
		&lt;/dependency&gt;
