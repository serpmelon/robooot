package com.togo.collector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author taiyn
 * @version 1.0
 * @date Created in 2019年10月27日 17:22
 * @since 1.0
 */
public class HtmlCollector {

    public static void main(String[] args) throws IOException {
//        https://list.tmall.com/search_product.htm?q=%CF%D4%CA%BE%C6%F7&type=p&spm=a220m.1000858.a2227oh.d100&from=.list.pc_1_searchbutton
        String url = "https://list.tmall.com/search_product.htm?q=%B5%E7%C4%D4&type=p&spm=a220m.1000858.a2227oh.d100&xl=diannao_1&from=.list.pc_1_suggest";

        Document document = Jsoup.connect(url).get();
        Element body = document.body();
        Element itemList = body.getElementById("J_ItemList");
        Elements elements = itemList.children();
        for (Element element : elements) {

//            if (element.attr("data-id").equals("568411009822")) {

            for (Element child : element.children()) {

                System.out.println(element.children().size());
                System.out.println(element.children().get(0).children().size());
                for (Element c : child.children()) {

                    System.out.println("#####################################################");
                    System.out.println(c);

                }
//                }
            }

            break;
        }
    }

}