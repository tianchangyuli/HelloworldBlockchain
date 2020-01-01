package com.xingkaichun.blockchain.core;

import com.xingkaichun.blockchain.core.BlockChainDataBase;
import com.xingkaichun.blockchain.core.model.transaction.Transaction;

import java.math.BigDecimal;
import java.util.List;

/**
 * 挖矿奖励
 */
public class MineAward {

    /**
     * 挖矿的奖励
     * @param blockChainDataBase 区块链
     * @param blockHeight 待挖取区块的高度
     * @param packingTransactionList 待挖取区块的交易
     * @return
     */
    public BigDecimal mineAward(BlockChainDataBase blockChainDataBase, int blockHeight, List<Transaction> packingTransactionList) {
        return new BigDecimal("100");
    }
}