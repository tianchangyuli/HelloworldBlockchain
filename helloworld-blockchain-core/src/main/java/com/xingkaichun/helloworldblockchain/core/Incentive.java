package com.xingkaichun.helloworldblockchain.core;

import com.xingkaichun.helloworldblockchain.core.model.Block;

/**
 * 矿工挖矿激励
 *
 * @author 邢开春 409060350@qq.com
 */
public abstract class Incentive {

    /**
     * 奖励给矿工的挖矿激励数额。
     * 这里只给出挖矿的激励数额。至于这个激励怎么分配，应当由矿工进行决定。
     */
    public abstract long reward(Block block) ;
}
