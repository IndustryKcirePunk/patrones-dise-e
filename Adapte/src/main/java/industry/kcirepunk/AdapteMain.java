package industry.kcirepunk;

import industry.kcirepunk.impl.*;

public class AdapteMain {

    public static void main(String[] args) {
        BankCreditRequest request = new BankCreditRequest();
        request.setCustomer("Erick Torres");
        request.setAmount(1000);

        IBankAdapter xBank = new XBankCreditAdapter();
        BankCreditResponse xresponse = xBank.sendCreditRequest(request);
        System.out.println("xBank approved: " + xresponse.isApproved() + "\n");

        IBankAdapter yBank = new YBankCreditAdapter();
        BankCreditResponse yresponse = yBank.sendCreditRequest(request);
        System.out.println("yBank approved: " + yresponse.isApproved() + "\n");

        if (xresponse.isApproved()) {
            System.out.println("xBank aprobo su credito, felicidades");
        } else if (yresponse.isApproved()) {
            System.out.println("yBank aprobo su credito, felicidades");
        } else {
            System.out.println("Lo sentimo no aprobamos tu credito");
        }

    }

}
