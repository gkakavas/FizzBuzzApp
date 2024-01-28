package george.fizzbuzz.controller;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;

import java.util.List;

public interface CmdWrite {
    void promptForDivisorAndWord();
    void promptForMorePairsOrNot();
    void resultMessage();
    void result(List<DivisorAndWordRequestDTO> requestList);
    void promptForRunAgainTheApp();
}
