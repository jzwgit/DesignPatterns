### 单例模式
        是指确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，它提供全局访问的方法
        
        例如：一个班的所有学生共享班主任这一个实例
#### 懒汉模式
        在创建实例对象时不加上synchromized则会导致对对象的访问不是线程安全
        
#### 饿汉模式
        线程安全