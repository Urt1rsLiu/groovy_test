package main.basic

import main.Test

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/21 11:31 
 */
class ListTest implements Test{

    List ls

    /**
     * 对groovy中list的测试
     */
    @Override
    void runTest() {
        initList()
        printList()
    }

    void initList(){
        ls = new ArrayList()
        ls.add(0,6)
        ls.add(1,2)


    }

    /**
     * 与java 中ArrayList 的forEach 不同，这里的each 也能在数组中使用,而且each 的参数是一个闭包
     * 在数组中，index 索引能为负数，这一点和java 不同，当为负数时，倒数索引，如-1 表述最后一个元素的索引
     * 但List 的索引和java 相同，索引值不能为负数
     */
    void printList(){
        ls.each {println(it)}

        //报错，List中的index 不能为负数
//        print(ls.get(-1))

        def arr = [3,4,5]
        arr.each {print(it)}
        //不会报错，index 在数组中能为负数
        print("\n" + arr[-1])

    }

}
