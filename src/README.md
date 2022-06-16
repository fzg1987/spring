**Spring两大核心机制**
· IoC：工厂模式
· AOP：代理模式
**IoC**
IoC是Spring框架的灵魂，控制反转
lombok可以帮助开发者自动生成实体类相关的方法,必须预先安装插件
@Data--全部
@Getter、@Setter、@NoArgsConstructor、@AllArgsConstructor
**开发步骤**
1、创建Maven工程，pom.xml导入依赖；
2、在resources路径下创建spring.xml
3、IoC容器通过读取spring.xml配置文件，加载bean标签来创建对象。
4、调用API获取IoC容器中已经创建的对象。
**IoC容器创建bean的两种方式**
· 无参构造