##### 1. SpringCloud的版本关系

SpringCloud的版本采用了名称而非版本号的命名，这些版本号采用了伦敦地铁站的名字，根据字母表的顺序来对应版本时间顺序，例如Angel是第一个版本， Brixton是第二个版本。当SpringCloud的发布内容积累到临界点或者一个重大BUG被解决后，会发布一个"service releases"版本，简称SRX版本，比如Greenwich.SR2就是SpringCloud发布的Greenwich版本的第2个SRX版本。 

**SpringCloud和SpringBoot版本对应关系**

| **SpringCloud Version** | **SpringBoot Version** |
| :---------------------: | :--------------------: |
|         Hoxton          |         2.2.x          |
|        Greenwich        |         2.1.x          |
|        Finchley         |         2.0.x          |
|         Edgware         |         1.5.x          |
|         Dalston         |         1.5.x          |
|         Brixton         |         1.3.x          |
|          Angel          |         1.2.x          |

[详细的版本对应]( https://start.spring.io/actuator/info )

[ spring官方对应查看网址 ]( https://start.spring.io/actuator/info )

[json在线格式化工具]( https://www.json.cn/ )

|     **spring-boot-starter-parent**      | **spring-cloud-dependencies** |
| :-------------------------------------: | :---------------------------: |
|              1.5.2.RELEASE              |          Dalston.RC1          |
|              1.5.9.RELEASE              |        Edgware.RELEASE        |
|             1.5.16.RELEASE              |          Edgware.SR5          |
|             1.5.20.RELEASE              |          Edgware.SR5          |
|  Spring Boot >=2.0.0.M3 and <2.0.0.M5   |          Finchley.M2          |
|  Spring Boot >=2.0.0.M5 and <=2.0.0.M5  |          Finchley.M3          |
|  Spring Boot >=2.0.0.M6 and <=2.0.0.M6  |          Finchley.M4          |
|  Spring Boot >=2.0.0.M7 and <=2.0.0.M7  |          Finchley.M5          |
| Spring Boot >=2.0.0.RC1 and <=2.0.0.RC1 |          Finchley.M6          |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |
|                                         |                               |

