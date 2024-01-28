package george.fizzbuzz.service;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;
import george.fizzbuzz.dto.FizzBuzzPrintResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzServiceImpl implements FizzBuzzService {
    @Override
    public List<FizzBuzzPrintResponseDTO> calculateResponse(List<DivisorAndWordRequestDTO> requestList) {
        List<FizzBuzzPrintResponseDTO> responseList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            responseList.add(new FizzBuzzPrintResponseDTO());
            for (DivisorAndWordRequestDTO request : requestList) {
                if (i % request.getDivisor() == 0) {
                    if (!responseList.get(i-1).isEmpty()) {
                        var updatedResponse = new FizzBuzzPrintResponseDTO(
                                responseList.get(i-1)
                                        .getData()
                                        .concat(request.getWord()));
                        responseList.set(i-1, updatedResponse);
                    }
                    else
                        responseList.set(i-1, new FizzBuzzPrintResponseDTO(request.getWord()));
                }
            }
            if(responseList.get(i-1).getData() == null) {
                responseList.set(i-1,new FizzBuzzPrintResponseDTO(String.valueOf(i)));
            }
        }
        return responseList;
    }
}
