package rvt;


public class Money {

private final int euros;
private final int cents;

public Money(int euros, int cents) {
this.euros = euros;
this.cents = cents;
}

public int euros() {
return euros;
}

public int cents() {
return cents;
}

public String toString() {
String zero = "";
if (cents <= 10) {
zero = "0";
}

return euros + "." + zero + cents + "EUR ";
}
public Money plus(Money addition) {
int euros = this.euros() + addition.euros();
int cents = this.cents() + addition.cents();
if (cents >= 100){
euros = euros + 1;
cents = cents - 100;

}
Money newMoney = new Money(euros, cents);
return newMoney;


}
public boolean lessThan(Money compared){
if(this.euros() < compared.euros()){
return true;
}
if(this.euros() == compared.euros() && this.cents() < compared.cents()){
return true;
}
return false;
}


public Money minus(Money decreaser){
Money minusobject = new Money(this.euros(), this.cents());
int cents = this.cents();
int euros = this.euros();
if(this.lessThan(decreaser)){
minusobject = new Money(0, 0);
return minusobject;
}
if(this.cents() < decreaser.cents()){
cents = cents + 100;
cents = cents - decreaser.cents();
euros = euros - 1;
euros = euros - decreaser.euros();
}else{
cents = cents - decreaser.cents();
euros = euros - decreaser.euros();
}
minusobject = new Money(euros, cents);
return minusobject;
}


}