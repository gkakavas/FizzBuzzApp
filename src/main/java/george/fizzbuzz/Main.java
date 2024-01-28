package george.fizzbuzz;

import george.fizzbuzz.controller.CmdRead;
import george.fizzbuzz.controller.CmdReadImpl;
import george.fizzbuzz.controller.CmdWrite;
import george.fizzbuzz.controller.CmdWriteImpl;
import george.fizzbuzz.runner.AppRunner;
import george.fizzbuzz.runner.Runner;
import george.fizzbuzz.service.FizzBuzzService;
import george.fizzbuzz.service.FizzBuzzServiceImpl;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FizzBuzzService service = new FizzBuzzServiceImpl();
        CmdRead cmdReader = new CmdReadImpl(scanner);
        CmdWrite cmdWriter = new CmdWriteImpl(service);
        Runner runner = new AppRunner(cmdReader,cmdWriter);
        runner.run();
    }
}