import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        JDepend jDepend = new JDepend(new PrintWriter("reports/report.xml"));
        jDepend.addDirectory("D:\\Library-Assistant");
        jDepend.analyze();

        System.out.printf("DONE");
    }
}
