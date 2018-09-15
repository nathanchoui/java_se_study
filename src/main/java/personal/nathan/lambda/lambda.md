### lambda

对于只有一个抽象方法的接口，需要一个接口的对象时，提供一个lambda表达式。
这种接口称为函数式接口(functional interface)。

#### 分隔符方法调用
1. object::instanceMethod
2. Class::staticMethod
3. Class::instanceMethod
4. super::instanceMethod
5. Class::new

说明：第一种和第二种等价于代参数的lambda表达式。
```$xslt
System.out::println

x -> System.out.println(x)
```

```$xslt
Math::pow

(x,y) -> Math.pow(x,y)
```

第三种，第一个参数会称为方法的目标
```$xslt
String:compareToIgnoreCase
(x,y) -> x.compareToIgnoreCase(y)
```

第四种，调用父类方法

第五种，调用构造器方法