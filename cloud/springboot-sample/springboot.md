springboot 约定优于配置
1：起步依赖
2：自动配置
自动将bean注入到ioc容器中
springboot 全局配置文件
自定义配置文件
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:Test.properties")

随机值设置，参数的间的引用

springboot 原理和源码刨析
依赖刨析

springboot 执行原理

@autoConfiguationPackage  自动配置包，会把标注@springbootApplication注解标注的类拿到包名，并对该类以及该类下的子包进行扫描，并将组件加载到容器中

自定义starter
1： 
2：
3：
4：

 