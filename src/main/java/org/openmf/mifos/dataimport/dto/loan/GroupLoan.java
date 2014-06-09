package org.openmf.mifos.dataimport.dto.loan;

import java.util.List;

public class GroupLoan extends Loan {

    private final String groupId;

    public GroupLoan(String loanType, String groupId, String productId, String loanOfficerId, String submittedOnDate, String fundId,
            String principal, String numberOfRepayments, String repaymentEvery, String repaymentFrequencyType, String loanTermFrequency,
            String loanTermFrequencyType, String interestRatePerPeriod, String expectedDisbursementDate, String amortizationType,
            String interestType, String interestCalculationPeriodType, String inArrearsTolerance, String transactionProcessingStrategyId,
            String graceOnPrincipalPayment, String graceOnInterestPayment, String graceOnInterestCharged, String interestChargedFromDate,
            String repaymentsStartingFromDate, Integer rowIndex, String status, String externalId, String linkAccountId,
            String fixedEmiAmount, String maxOutstandingLoanBalance, List<TrancheDetail> disbursementData) {

        super(loanType, null, productId, loanOfficerId, submittedOnDate, fundId, principal, numberOfRepayments, repaymentEvery,
                repaymentFrequencyType, loanTermFrequency, loanTermFrequencyType, interestRatePerPeriod, expectedDisbursementDate,
                amortizationType, interestType, interestCalculationPeriodType, inArrearsTolerance, transactionProcessingStrategyId,
                graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, interestChargedFromDate,
                repaymentsStartingFromDate, rowIndex, status, externalId, null, null, linkAccountId, fixedEmiAmount,
                maxOutstandingLoanBalance, disbursementData);

        this.groupId = groupId;
    }

    @Override
    public String getGroupId() {
        return groupId;
    }

}
