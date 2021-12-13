package Exception;

public class ModelException extends Exception{

    private final static int TITLE_EMPTY = 1;
    private final static int IS_EXISTS = 2;
    private final static int DATE_FORMAT = 3;
    private final static int CODE_EMPTY = 4;
    private final static int CURRENCY_EMPTY = 5;
    private final static int ARTICLE_EMPTY = 6;
    private final static int ACCOUNT_EMPTY = 7;
    private final static int RATE_INCORRECT = 8;
    private final static int AMOUNT_FORMAT = 9;
    private final static int NO_BASE_CURRENCY = 10;

    private final int code;

    public ModelException(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        switch (code) {
            case TITLE_EMPTY:
                return "ERROR_TITLE_EMPTY";
            case IS_EXISTS:
                return "ERROR_IS_EXISTS";
            case DATE_FORMAT:
                return "ERROR_DATE_FORMAT";
            case CODE_EMPTY:
                return "ERROR_CODE_EMPTY";
            case CURRENCY_EMPTY:
                return "ERROR_CURRENCY_EMPTY";
            case ARTICLE_EMPTY:
                return "ERROR_ARTICLE_EMPTY";
            case ACCOUNT_EMPTY:
                return "ERROR_ACCOUNT_EMPTY";
            case RATE_INCORRECT:
                return "ERROR_RATE_INCORRECT";
            case AMOUNT_FORMAT:
                return "ERROR_AMOUNT_FORMAT";
            case NO_BASE_CURRENCY:
                return "ERROR_NO_BASE_CURRENCY";
        }
        return "";
    }
}
