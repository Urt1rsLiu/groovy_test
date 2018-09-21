package main

import main.basic.BasicTest
import main.basic.ClosureTest
import main.basic.ListTest
import main.basic.MultiMethodTest
import main.basic.PojoTest

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 10:20 
 */

class Run{

    static void main(String[] args){
        def gt

//        gt = new MultiMethodTest()
//        gt = new PojoTest()
//        gt = new ListTest()
        gt = new ClosureTest()


        gt.runTest()
    }



}
