package ElectricCalcException;

/**
 * Created by nimtego_loc on 18.11.2016.
 */
public class NotCorectEnteringException extends ECException{
    private Object number;
    public Object getNumber(){return number;}
    public NotCorectEnteringException(String message, Object num){
        super(message);
        number=num;
    }
    @Override
    public String toString() {
        return super.getMessage() +" " +getNumber();
    }
}
