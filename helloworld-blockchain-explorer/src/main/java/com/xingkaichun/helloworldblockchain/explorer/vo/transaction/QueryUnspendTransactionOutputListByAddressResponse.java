package com.xingkaichun.helloworldblockchain.explorer.vo.transaction;

import java.util.List;

/**
 *
 * @author 邢开春 409060350@qq.com
 */
public class QueryUnspendTransactionOutputListByAddressResponse {

    private List<TransactionOutputDetailView> transactionOutputDetailViewList;

    public List<TransactionOutputDetailView> getTransactionOutputDetailViewList() {
        return transactionOutputDetailViewList;
    }

    public void setTransactionOutputDetailViewList(List<TransactionOutputDetailView> transactionOutputDetailViewList) {
        this.transactionOutputDetailViewList = transactionOutputDetailViewList;
    }
}
