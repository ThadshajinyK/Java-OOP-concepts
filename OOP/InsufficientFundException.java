package OOP;

import java.security.cert.Extension;

public class InsufficientFundException extends Exception {
    double amount;
InsufficientFundException(double amt){
    this.amount=amt;
}
}
