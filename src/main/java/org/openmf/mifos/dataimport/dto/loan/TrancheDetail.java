package org.openmf.mifos.dataimport.dto.loan;

public class TrancheDetail {

    private final String expectedDisbursementDate;
    private final String principal;

    public TrancheDetail(final String expectedDisbursementDate, final String principal) {
        this.expectedDisbursementDate = expectedDisbursementDate;
        this.principal = principal;
    }

    public String getExpectedDisbursementDate() {
        return expectedDisbursementDate;
    }

    public String getPrincipal() {
        return principal;
    }

}
