
package com.mycompany.assignment5;


public class permanentEmploye extends employe{
    double salry;
    double bonus;
    double tax;

    public permanentEmploye() {
    }
    public double caculate_net_sal (double netSal){
        netSal=salry+bonus-tax;
        return netSal;
    }
}
