package Controller;

import com.example.demo.Month;
import com.example.demo.MonthInterceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {

    private final MonthInterceptor monthInterceptor;

    public MonthController(MonthInterceptor monthInterceptor) {
        this.monthInterceptor = monthInterceptor;
    }

    @GetMapping("/months")
    public Month getMonth(@RequestHeader(required = false) Integer monthNumber) {
        return monthInterceptor.processMonth(monthNumber);
    }
}