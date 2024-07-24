


# Spring 生命周期
1. 创建Bean对象
2. 给Bean对象设置属性
3. 初始化Bean对象

# Spring ioc di
什么是ioc
ioc是Inversion of Control的缩写，即控制反转，是Spring框架的核心。
ioc是控制反转，即由Spring框架控制Bean对象的创建和销毁。

# Spring AOP
AOP是Aspect Oriented Programming的缩写，即面向切面编程。
AOP是Spring框架的核心。
jdk proxy cglib proxy

# Spring MVC
1. DispatcherServlet
2. HandlerMapping
3. HandlerAdapter
4. ViewResolver
5. View
6. ModelAndView

# Spring Boot
1. Spring Boot 是 Spring 框架的子集，Spring Boot 是 Spring 框架的简化版。
2. Spring Boot 是一个快速开发框架，它简化了 Spring 框架的配置，提供了默认配置，并自动装配了依赖。

# Spring 循环依赖
1. 循环依赖是指在Bean对象初始化过程中，存在依赖关系，导致Bean对象之间存在循环依赖。
2. Spring 循环依赖的解决方法：
1. 构造器注入：通过构造器注入，解决循环依赖问题。
2. setter 注入：通过setter方法注入，解决循环依赖问题。
3. 静态工厂方法注入：通过静态工厂方法注入，解决循环依赖问题。
4. 实例工厂方法注入：通过实例工厂方法注入，解决循环依赖问题。
5. 懒加载：通过懒加载，解决循环依赖问题。
6. 代理模式：通过代理模式，解决循环依赖问题。

# Spring 容器
1. Spring 容器是Spring框架的核心。

# 如何创建一个自定义注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
@Aspect
@Component
拦截 处理事件
@Pointcut("@annotation(com.example.demo.annotation.MyAnnotation)")
public void pointcut() {
}
@MyAnnotation
public class MyClass {
    public void myMethod() {
        System.out.println("执行myMethod方法");
    }
}




