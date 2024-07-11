package ex.Q4;

class ExcessiveCheeseException extends Exception{
    private int maxCheeseAllowed;
    private int requestedCheeseAmount;

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    ExcessiveCheeseException(String message, int maxCheeseAllowed, int requestedCheeseAmount){
        super(message);
        this.maxCheeseAllowed = maxCheeseAllowed;
        this.requestedCheeseAmount = requestedCheeseAmount;
    }

    public String getDetails(){
        return String.format("요청하신 치즈의 양: %d g, 주문 가능한 최대 치즈의 양: %d g", requestedCheeseAmount,maxCheeseAllowed);
    }

    public int getMaxCheeseAllowed() {
        return maxCheeseAllowed;
    }

    public int getRequestedCheeseAmount() {
        return requestedCheeseAmount;
    }
}
