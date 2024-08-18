package Aug.B18082024.Collection_Framework.Custom_Exception;

public class Bank {
    private String curerncy;
    private Integer amount;
    public Bank(String curerncy,Integer amount){
        this.curerncy=curerncy;
        this.amount=amount;
    }
    public String getCurerncy(){
        return curerncy;
    }
    public void setCurerncy(){
        this.curerncy=curerncy;
    }
    public Integer getAmount(){
        return amount;
    }
    public void setAmount(){
        this.amount=amount;
    }
    public Integer add(Bank bankName){
        if(!bankName.curerncy.equalsIgnoreCase("INR")){
            //throw exception that is not supported -USD, GBP+INR
            try {
                throw new Exception("Currency Doesn't Match");
            }
            catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        Integer sum=this.amount + bankName.amount;
        return sum;
    }
}
