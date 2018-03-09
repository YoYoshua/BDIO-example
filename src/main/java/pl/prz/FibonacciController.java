package pl.prz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController
{
    @RequestMapping("/fibonacci")
    public Fibonacci fibonacci(@RequestParam(value = "var", defaultValue = "0") String var)
    {
        int varInt = Integer.parseInt(var);
        return new Fibonacci(varInt);
    }
}
