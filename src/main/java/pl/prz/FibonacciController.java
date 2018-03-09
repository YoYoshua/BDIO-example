package pl.prz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController
{
    @RequestMapping("/fibonacci")
    public Fibonacci fibonacci(@RequestParam(value = "index", defaultValue = "0") int index)
    {
        return new Fibonacci(index);
    }
}
