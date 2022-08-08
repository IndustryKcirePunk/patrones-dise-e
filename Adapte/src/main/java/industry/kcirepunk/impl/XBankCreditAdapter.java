package industry.kcirepunk.impl;

import industry.kcirepunk.creditapi.bankx.XBankCreditRequest;
import industry.kcirepunk.creditapi.bankx.XBankCreditAPI;
import industry.kcirepunk.creditapi.bankx.XBankCreditResponse;


public class XBankCreditAdapter implements IBankAdapter {

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        XBankCreditRequest xrequest = new XBankCreditRequest();
        xrequest.setCustomerName(request.getCustomer());
        xrequest.setRequestAmount(request.getAmount());

        XBankCreditAPI api = new XBankCreditAPI();
        XBankCreditResponse xresponse = api.sendCreditRequest(xrequest);

        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(xresponse.isAproval());

        return response;
    }

}
