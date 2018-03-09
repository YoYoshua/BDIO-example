package pl.prz;

public class Fibonacci
{
    private int result;

    public Fibonacci(int x)
    {
        this.result = fibValue(x - 1);
    }

    private int fibValue(int x)
    {
        if (x == 1 || x == 0) return 1;
        else
            return fibValue(x - 1) + fibValue(x - 2);
    }

    public int getResult()
    {
        return result;
    }
}
