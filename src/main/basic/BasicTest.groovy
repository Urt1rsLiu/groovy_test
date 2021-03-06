package main.basic

import junit.textui.TestRunner
import main.Test

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 10:35 
 */

/**
 * 该包是对groovy 基本语法的学习的总结与分析
 */
class BasicTest implements Test {
    @Override
    void runTest() {
        println('hello world')


        Object object = "object"
        println(printInt(object))

        assert object == "object" : "object is"
        def allTest = new GroovyTestSuite()
        allTest.addTestSuite(ClosureTest.class)
        TestRunner.run(allTest)

    }

    int printInt(String arg){
        return 1
    }

    int printInt(Object arg){
        return 2
    }
}
