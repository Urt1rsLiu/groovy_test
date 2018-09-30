package main.basic

import main.Test
import main.basic.pojo.Person

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 11:12 
 */
class PojoTest implements Test {

    /**
     * 如果类的成员变量没有加任何权限访问，则称为Property, 否则是Field
     * filed 和Java 中的成员变量相同
     * Property的话，它是一个private field 和getter setter的集合，也就是说groovy会自动生成getter setter方法
     * 因此在类外面的代码，都是透明的调用getter和setter方法
     */

    @Override
    void runTest() {
        def person = new Person(name: 'liu')
//        person.name = 'lhz'
        person.setName("lhz")
        println(person.getName())

    }
}
