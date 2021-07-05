package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    @ResponseBody
    public Hello hello(@RequestParam("data") String name, Model model) {
        Hello hello_json = new Hello();
        hello_json.setData(name);
        return hello_json;
    }

    class Hello {
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        String data;
    }


}
