package george.fizzbuzz.controller;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;

public interface CmdRead {
    DivisorAndWordRequestDTO theUserWordAndDivisor();
    Boolean ifUserContinueOrStop();
    Boolean ifUserWantToRunAppAgain();
}
