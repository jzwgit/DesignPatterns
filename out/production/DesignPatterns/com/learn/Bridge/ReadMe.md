### 桥接模式
        将抽象部分与他的现实部分分离，使他们都可以独立的变化。
        
        可以理解为：将抽象部分与现实部分分开，使之任意增减，而无须受其他约束
        
#### 优势
        1、使接口与实现各自独立
        2、使接口实现类的扩展性大大增强
        3、保护了部分实现内容，在扩展与变更实现内容时，无须重新编译元客户程序
        4、基于此我认为可以再一下集中情形下采用桥接模式进行软件设计与实施
        5、需要增强抽象角色与具体角色的灵活性，以避免两者之间的直接关联
        6、实现类的变动，不影响客户端的使用
        7、抽象接口与类的实现通过结合，均可在子类上进行扩展
        