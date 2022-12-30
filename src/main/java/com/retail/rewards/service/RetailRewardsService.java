package com.retail.rewards.service;

import com.retail.rewards.model.RetailRewards;

public interface RetailRewardsService {
    public RetailRewards getRewardsByCustomerId(Long customerId);
}
