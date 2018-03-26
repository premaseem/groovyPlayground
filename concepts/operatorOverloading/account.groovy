import groovy.transform.ToString

// Basically a + b calls a.plus(b) so we will override it

@ToString
class Account {
    BigDecimal balance =0.0
    String type // saving or checking

    BigDecimal plus(Account other){
        this.balance + other.balance
    }

    String toString(){
        return "accont balance : $balance"
    }

    void deposit(BigDecimal amt){

        balance = balance + amt
//        print balance
    }

    void withdraw(BigDecimal amt){
        balance = balance - amt
    }
}

Account saving = new Account(type:"saving")
saving.deposit(200)
saving.withdraw(100)
println "current saving balance $saving.balance"
//print saving.balance
Account checking = new Account("type":"checking")
checking.deposit(1000)
println saving + checking