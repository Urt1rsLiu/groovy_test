package main.basic

import main.Test
import main.basic.pojo.Person

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 11:12 
 */
class PojoTest implements Test {

    /**
     * 在Groovy 中，会默认地为 类中为public的成员变量 隐式地创建 Getter 和 Setter 方法，并提供带参的Constructor
     * pojo 的成员变量必须为public
     * 利用隐式的带参的Constructor 创建对象时，需要指明 参数代表的成员变量的声明时名称
     */

    @Override
    void runTest() {
        def person = new Person(name: 'liu')
//        person.name = 'lhz'
        person.setName("lhz")
        println(person.getName())

    }
}
