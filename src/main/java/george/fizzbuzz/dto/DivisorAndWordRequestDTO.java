package george.fizzbuzz.dto;

public class DivisorAndWordRequestDTO {
    private Integer divisor;

    private String word;

    public DivisorAndWordRequestDTO(){}

    public DivisorAndWordRequestDTO(Integer divisor, String word){
        this.divisor = divisor;
        this.word = word;
    }

    public void setDivisor(Integer divisor) {
        this.divisor = divisor;
    }

    public Integer getDivisor() {
        return divisor;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

}
