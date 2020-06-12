**Maven之<dependencyManagement>标签介绍**

    介绍:
        我们知道使用Maven能够方便我们的项目开发，他能帮助我们管理构建、文档、报告、依赖、scms、发布、分发的方法。
        可以方便的编译代码、进行依赖管理、管理二进制库等等。
    一般Maven管理的问题：
        但是当我们的模块很多时,每一个模块的pom文件下都维护了自己的一份版本号和对应的denpendecy
        如果当我们需要更改某一个依赖的时候尤其是公共的依赖的时候就变得非常不方便。
    解决方案：    
        这是我们的<dependencyManagement>就派上它的用场了。通过来管理jar包的版本，让子项目中引用一个依赖而不用显示的列出版本号。
        Maven会沿着父子层次向上走，直到找到一个拥有dependencyManagement元素的项目，然后它就会使用在这个dependencyManagement元素中指定的版本号。
        这样就解决了公共依赖版本的问题。
        
    
**样例：**

    例如我们当前项目骨架的父POM文件：
    
    `<!--    使用dependencyManagement标签统一管理子依赖版本号 -->
         <dependencyManagement>
             <dependencies>
                 <!-- 引入springboot整合dubbo启动类包-->
                 <dependency>
                     <groupId>org.apache.dubbo</groupId>
                     <artifactId>dubbo-spring-boot-starter</artifactId>
                     <version>${dubbo.starter.version}</version>
                     <exclusions>
                         <exclusion>
                             <groupId>org.slf4j</groupId>
                             <artifactId>slf4j-log4j12</artifactId>
                         </exclusion>
                     </exclusions>
                 </dependency>
                 <dependency>
                     <groupId>org.projectlombok</groupId>
                     <artifactId>lombok</artifactId>
                     <version>${lombok.version}</version>
                     <scope>provided</scope>
                 </dependency>
                 <dependency>
                     <groupId>org.apache.dubbo</groupId>
                     <artifactId>dubbo</artifactId>
                     <version>2.7.3</version>
                 </dependency>
                 <dependency>
                     <groupId>org.apache.curator</groupId>
                     <artifactId>curator-framework</artifactId>
                     <version>4.0.1</version>
                 </dependency>
                 <dependency>
                     <groupId>org.apache.curator</groupId>
                     <artifactId>curator-recipes</artifactId>
                     <version>2.8.0</version>
                 </dependency>
                 <dependency>
                     <groupId>com.101tec</groupId>
                     <artifactId>zkclient</artifactId>
                     <version>0.10</version>
                 </dependency>
                 <dependency>
                     <groupId>org.apache.zookeeper</groupId>
                     <artifactId>zookeeper</artifactId>
                     <version>3.4.13</version>
                     <type>pom</type>
                     <exclusions>
                         <exclusion>
                             <groupId>org.slf4j</groupId>
                             <artifactId>slf4j-log4j12</artifactId>
                         </exclusion>
                     </exclusions>
                 </dependency>
             </dependencies>
     
         </dependencyManagement>
     
     
         <build>
     <!--    使用pluginManagement标签同一个管理子模块插件依赖-->
             <pluginManagement>
                 <plugins>
                     <plugin>
                         <groupId>org.springframework.boot</groupId>
                         <artifactId>spring-boot-maven-plugin</artifactId>
                         <version>${spring-boot.version}</version>
                     </plugin>
                     <plugin>
                         <artifactId>maven-compiler-plugin</artifactId>
                         <configuration>
                             <target>${java.version}</target>
                             <source>${java.version}</source>
                             <encoding>UTF-8</encoding>
                         </configuration>
                     </plugin>
                 </plugins>
             </pluginManagement>
         </build>`
         
    子模块POM样例：
        `<dependencies>
         
                 <dependency>
                     <groupId>com.yonyou.auto</groupId>
                     <artifactId>meeting-api-demo</artifactId>
                     <version>0.0.1-SNAPSHOT</version>
                 </dependency>
         
         
                 <dependency>
                     <groupId>org.springframework.boot</groupId>
                     <artifactId>spring-boot-starter-web</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>org.springframework.boot</groupId>
                     <artifactId>spring-boot-starter-test</artifactId>
                 </dependency>
             
                 <!--直接使用父POM配置的依赖而不用加版本号方便版本号的同意管理-->
                 <dependency>
                     <groupId>org.apache.dubbo</groupId>
                     <artifactId>dubbo-spring-boot-starter</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>org.apache.dubbo</groupId>
                     <artifactId>dubbo</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>org.apache.curator</groupId>
                     <artifactId>curator-framework</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>org.apache.curator</groupId>
                     <artifactId>curator-recipes</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>com.101tec</groupId>
                     <artifactId>zkclient</artifactId>
                 </dependency>
         
                 <dependency>
                     <groupId>org.apache.zookeeper</groupId>
                     <artifactId>zookeeper</artifactId>
                     <type>pom</type>
                 </dependency>
         
             </dependencies>
         
             <build>
                 <plugins>
                    <!--直接使用父POM配置插件的而不用加版本号方便版本号的统一管理如果不想使用继承的版本号直接加入version版本号酒啊后-->
                     <plugin>
                         <groupId>org.springframework.boot</groupId>
                         <artifactId>spring-boot-maven-plugin</artifactId>
                     </plugin>
                 </plugins>
             </build>`
        
        
        