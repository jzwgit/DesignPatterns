### 解释器模式
        给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
        
        理解为：对需要解释的语言进行解释，在实际项目开发中并不常见。
        
#### 优势
        1、解释器模式具备良好的扩展性；通过修改费终结符类，即可维护语法规则。通过添新添非终结符类，即可扩展语法结构
        2、解释器中内容不同的类，实现了不同的规则。因此，简化了语法规则的实现。