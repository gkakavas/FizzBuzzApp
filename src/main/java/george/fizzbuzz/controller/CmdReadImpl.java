package george.fizzbuzz.controller;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;

import java.util.Scanner;

public class CmdReadImpl implements CmdRead {
    private final Scanner scanner;
    /**
     * In the runner class I need to add a delimiter like this
     * scanner.useDelimiter(":\\s*");
     */
    public CmdReadImpl(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public DivisorAndWordRequestDTO theUserWordAndDivisor(){
        if(scanner.hasNext()){
            var request = scanner.next();
            String[] parts = request.split(":");
            return new DivisorAndWordRequestDTO(
                    Integer.parseInt(parts[1]),
                    parts[0]
            );
        }
        return null;
    }

    public Boolean ifUserContinueOrStop(){
        if(scanner.hasNext()){
            var option = scanner.next();
            return option.equals(String.valueOf('y'));
        }
        else return false;
    }

    @Override
    public Boolean ifUserWantToRunAppAgain() {
        if(scanner.hasNext()){
            var option = scanner.next();
            return option.equals(String.valueOf('y'));
        }
        else return false;
    }
}
