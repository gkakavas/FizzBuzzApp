package george.fizzbuzz.dto;

public class FizzBuzzPrintResponseDTO {
    private String data;

    public FizzBuzzPrintResponseDTO(){}

    public FizzBuzzPrintResponseDTO(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String toString(){
        return data;
    }

    public Boolean isEmpty() {
        return data == null ? true : false;
    }
}
