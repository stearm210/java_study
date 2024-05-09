package exercise2.Special_File.XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @Author：stearm210
 * @Package：exercise2.Special_File.XML
 * @Project：study
 * @name：XMLTest1
 * @Date：9/5/2024 16:07
 * @Filename：XMLTest1
 */
public class XMLTest1 {
    public static void main(String[] args) throws DocumentException {
        //使用Dom4J框架时，先将对象解析为一个文档对象，之后从文档对象中调用数据

        //1.创建Dom4J框架对象
        SAXReader saxReader=new SAXReader();

        //2.使用saxReader对象把需要解析的XML文件读成一个Document对象,也就是一个文档对象，解析成一个文档对象
        Document document = saxReader.read("D:\\java study\\IDEApro code\\study\\src\\helloword.xml");

        //3.从文档对象中解析XML文件数据
        Element root=document.getRootElement();
        System.out.println("文件根标签："+root.getName());

        //4.获取根元素下的全部一级子标签（元素）
        //这里的一级子标签（元素）就是两个user
        //这些获取到的子标签（元素）用一个list集合进行保存，之后使用for循环进行输出
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println("输出获取到的第一子标签："+element.getName());
        }

        //5.获取当前根标签下的某个子标签（元素）中的值
        Element people = root.element("people");
        System.out.println("获取当前根标签下的某个子标签（元素）中的值："+people.getText());

        //默认获取第一个子标签（元素）中的值
        Element user=root.element("user");
        System.out.println("获取第一个子标签（元素）中name标签中的值："+user.elementText("name"));

        //6.获取元素的属性信息,默认第一个子标签（元素）
        System.out.println("获取元素的属性信息："+user.attributeValue("id"));
        Attribute id = user.attribute("id");//将第一个子标签（元素）赋值为id
        System.out.println("第一个子标签中的name标签中的值"+id.getName());//
        System.out.println("第一个子标签的属性值"+id.getValue());

        //通过标签值获取对应的标签下的值
        List<Attribute> attributes = user.attributes();//这里用一个list进行存储
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+"="+attribute.getValue());
        }

        //7.获取全部的文本内容
        //获取当前标签下的子标签中的值
        //这里默认第一个子标签
        System.out.println(user.elementText("name"));
        System.out.println(user.elementText("地址"));
        System.out.println(user.elementText("password"));

    }
}
