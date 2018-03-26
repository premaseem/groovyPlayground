import groovy.transform.ToString

// Basically a + b calls a.plus(b) so we will override it

@ToString
class Account {
    BigDecimal balance

    Account plus(Account other){
        return new Account(balance: this.balance + other.balance)
    }

    String toString(){
        return "accont balance : $balance"
    }

}

Account saving = new Account(balance:100)
Account checking = new Account(balance:200)
print saving + checking