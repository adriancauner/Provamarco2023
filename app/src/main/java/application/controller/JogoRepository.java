package application.repository;

import org.springframework.stereotype.repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class IndexRerpository {
    @RequestMapping("/")
    public String home() {
        return "WEB-INF/home.jsp";
    }
}
