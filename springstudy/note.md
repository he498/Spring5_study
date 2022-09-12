beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>
</beans>
```


```java
@Component
public class User {
    public String name;
    //相当于<property name="name" value="小明"/>
    @Value("小明")
    public void setName(String name) {
        this.name = name;
    }
}
```
@Component 的衍生注解：
dao  @Repository
service @Service
controller @Controller

```
自动装配：
@Autowired 自动装配通过类型、名字 (不能唯一自动装配上属性则需要@Qualifier(value=""))
@Nullable 字段标记了这个注解，说明这个字段可以为null；
@Resource 自动装配通过名字、类型。
```



ProxyInvocationHandler工具类：
```java
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private  Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
      return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result=method.invoke(target,args);

        return result;
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
```

