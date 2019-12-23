springfragmwork 源码分析
1.springBean 的创建
springbean 和java对象的区别
 springbean一定是java对象
 java对象不一定是springbean
 springbean 是一个高级的java对象
 
springbean是如何被实例出来的？

解析配置
扫描
parse...
new BeanDefinition put map
遍历map
验证
实例化