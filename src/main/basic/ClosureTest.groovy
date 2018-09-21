package main.basic

import main.Test

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 13:40 
 */
class ClosureTest implements Test {

    /**
     * 测试总结groovy 闭包的使用
     * 闭包是groovy 中特殊的对象，闭包的主体是一段可执行的匿名代码块
     *
     * 闭包中可以定义参数，在代码块前加上 arg1,arg2...->   即可
     * 当闭包中没有显示声明参数时，默认有一个隐式的参数it
     * 参数在"  " 字符串中可以通过 ${param} 显示参数的值  ( 注意：在 '  ' 中无效 )
     *
     * 闭包调用有2 种形式：   1.闭包名(args)   2.闭包名.call(args)
     *
     */
    @Override
    void runTest() {
        printMap()
        String b3 = "b23"

//        assert b3 == "b212"

        def clo1 = { param1, param2 -> println "${param1},${param2},${b3}"; println param1 + " " + b3; println() }
        changeWorld(clo1)
        b3 = "Jim"
        changeWorld(clo1)


        def clo2 = { println "${it}" }
        clo2('hello,world!')

    }

    /**
     * 闭包能作为参数在函数中传递
     * @param clo
     */
    void changeWorld(Closure clo) {
        String str = "world"
        def str2 = "hello"
        clo.call(str2, str)
//        clo(str2, str)
    }

    /**
     * each()函数参数就是一个闭包，这里通过将闭包作为参数对 map 作输出操作
     * 这里each() 函数的左右括号可以省略，类似println() 函数
     * 观察map.each()源码，发现遍历map的原理是以下步骤：
     * 1.获取传入的闭包的形参数量，并循环遍历，若为1，则进行第2 个步骤，若为2，则进行第3 个步骤
     * 2.将遍历获取的entry 赋值给形参，然后执行 闭包.call(entry)
     * 3.将遍历获取的entry 再得到key 和value (entry.key),将key 和value 作为参数执行闭包
     * 原理是遍历map 的EntrySet，并将EntrySet 作为闭包的参数执行闭包
     */
    void printMap() {
        def map = ["MyName": "liu", "TopicName": "car", "cloud": "sky"]

        //each 的闭包里有1个参数时，底层默认为参数是entry 来执行闭包
        map.each({ println it.getKey() + " maps to ${it.getValue()}" })

        //each 的闭包里有2个参数时，底层则将entry的key 和value作为参数执行
        map.each {param1,param2->println(param1 + "maps to ${param2}")}
    }


}
