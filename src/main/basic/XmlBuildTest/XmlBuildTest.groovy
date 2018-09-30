package main.basic.XmlBuildTest

import groovy.xml.MarkupBuilder
import main.Test

/**
 * @author Hongzhi Liu  2014302580200@whu.edu.cn
 * @date 2018/9/25 14:13 
 */

/**
 * 对于xml文件的生成，Groovy 提供了两种方式MarkupBuilder和StreamingMarkupBuilder
 * 一般而言StreamingMarkupBuilder更专业，功能更全
 * 他们的区别有点类似于DOM和SAX， 也就说处理较大的xml文件，StreamingMarkupBuilder性能更好， 不过一般情况下，区别不大
 *
 * MakeupBuilder
 * MakeupBuilder 默认无参构造器
 */

class XmlBuildTest implements Test {
    @Override
    void runTest() {
        def xmlBuilder = new MarkupBuilder()
        xmlBuilder.coction(shelf : 'New Arrivals'){
            mov(title : 'Enemy Behind')
            tp('War, Thriller')
            format('D')
            year('2008')
            rating('PG')
            star(name:'wu yi fan' , 10)
            description('Talk about a US-Japan war')
        }
    }
}
