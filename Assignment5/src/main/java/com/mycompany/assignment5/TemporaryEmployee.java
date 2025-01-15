
package com.mycompany.assignment5;


public class TemporaryEmployee extends employe {
    double workHoures;
    double payPerHouer;

    public TemporaryEmployee() {
    }
    public double caclate_net_pay (double netPay){
        netPay=workHoures*payPerHouer;
        return netPay;
    }
}
