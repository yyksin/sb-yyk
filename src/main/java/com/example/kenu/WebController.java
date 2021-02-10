package com.example.kenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        String html = getLink("infoq.com");
        html += getLink("11st.co.kr");
        return html;
    }

    private String getLink(String site) {
        return "<a href=\"https://" + site + "\">" + site + "</a><br>";
    }

    @PostMapping("/")
    @ResponseBody
    public String mainPost() {
        return "<a href=\"https://infoq.com\">infoq.com</a>";
    }
}
