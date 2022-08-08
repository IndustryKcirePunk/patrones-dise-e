package industry.kcirepunk.creditapi.banky;

import industry.kcirepunk.creditapi.banky.YBankCreditApproveResult;

public interface YBankCreditSenderListener {
    public void notifyCreditResult(YBankCreditApproveResult result);
}
