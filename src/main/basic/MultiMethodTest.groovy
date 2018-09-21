package main.basic

import main.Test

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 11:02 
 */
class MultiMethodTest implements  Test{
    Object object = "object"


    /**
     * 这里的输出与Java 不同
     * Java 会在编译时就确定对象的类型,编译时确定的类型为声明的类型 Object
     * Groovy 在运行时对象被调用才确定对象的类型，运行时确定的类型为真正起作用的类型 String
     */
    @Override
    void runTest() {
        judgeType(object)
    }

    private void judgeType(Object arg){
        println('judge result is Object')
    }

    private void judgeType(String  arg){
        println('judge result is String')
    }


}
