package george.fizzbuzz.controller;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;
import george.fizzbuzz.dto.FizzBuzzPrintResponseDTO;
import george.fizzbuzz.service.FizzBuzzService;

import java.util.List;

public class CmdWriteImpl implements CmdWrite{

    private FizzBuzzService service;

    public CmdWriteImpl(FizzBuzzService service){
        this.service = service;
    }
    @Override
    public void promptForDivisorAndWord(){
        System.out.println("Please a give me a word and an integer" +
                "(the correct format to give is: word:divisor(as integer). Example: fizz:3 )");
    }
    @Override
    public void promptForMorePairsOrNot(){
        System.out.println("Would you want to add another key-value pair of word:divisor? " +
                "Please press y(for yes) or any key for no");
    }
    @Override
    public void resultMessage(){
        System.out.println("The result for the given pairs is: ");
    }

    @Override
    public void result(List<DivisorAndWordRequestDTO> requestList){
        var responseList = service.calculateResponse(requestList);
        for(FizzBuzzPrintResponseDTO response : responseList){
            System.out.println(response);
        }
    }

    @Override
    public void promptForRunAgainTheApp(){
        System.out.println("Would you want to rerun the app? " +
                "Please press y(for yes) or any key for no");
    }
}
