public class PhoneException extends RuntimeException {

    public PhoneException(String phone) {
        super("Такого номера нет: '" + phone + "'");
    }

}