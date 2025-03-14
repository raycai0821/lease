package com.atguigu.lease.web.admin.parser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class PareserTest {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:/l22ease/web/web-admin/src/main/java/com/atguigu/lease/web/admin/service/impl/ApartmentInfoServiceImpl.java");

        FileInputStream in = new FileInputStream(file);
        JavaParser parser = new JavaParser();
        CompilationUnit cu = parser.parse(in).getResult().get();
        System.out.println("开始");
        List<Node> rootNode = cu.getChildNodes();
////        System.out.println(rootNode);
//        cu.getEx.forEach(method -> {
//            System.out.println("method name---" + method.getNameAsString());
//        });
    }
}
