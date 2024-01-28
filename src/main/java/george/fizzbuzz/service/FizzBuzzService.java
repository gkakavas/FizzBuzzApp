package george.fizzbuzz.service;

import george.fizzbuzz.dto.DivisorAndWordRequestDTO;
import george.fizzbuzz.dto.FizzBuzzPrintResponseDTO;

import java.util.List;

public interface FizzBuzzService {
    List<FizzBuzzPrintResponseDTO> calculateResponse(List<DivisorAndWordRequestDTO> requestList);
}
