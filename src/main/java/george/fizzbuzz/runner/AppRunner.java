package george.fizzbuzz.runner;

import george.fizzbuzz.controller.CmdRead;
import george.fizzbuzz.controller.CmdWrite;
import george.fizzbuzz.dto.DivisorAndWordRequestDTO;

import java.util.ArrayList;
import java.util.List;

public class AppRunner implements Runner{
    private CmdRead cmdRead;
    private CmdWrite cmdWrite;
    private List<DivisorAndWordRequestDTO> requestList;

    public AppRunner(CmdRead cmdRead,CmdWrite cmdWrite){
        this.cmdRead = cmdRead;
        this.cmdWrite = cmdWrite;
        this.requestList = new ArrayList<>();
    }
    @Override
    public void run() {
        Boolean userOptionForPairs;
        Boolean userOptionForRerun;
        do{
            cmdWrite.promptForDivisorAndWord();
            var requestPair = cmdRead.theUserWordAndDivisor();
            requestList.add(requestPair);
            cmdWrite.promptForMorePairsOrNot();
            userOptionForPairs = cmdRead.ifUserContinueOrStop();
        }while (userOptionForPairs);
        cmdWrite.resultMessage();
        cmdWrite.result(requestList);
        cmdWrite.promptForRunAgainTheApp();
        userOptionForRerun = cmdRead.ifUserWantToRunAppAgain();
        if(userOptionForRerun) run();
        else System.exit(0);
    }
}
