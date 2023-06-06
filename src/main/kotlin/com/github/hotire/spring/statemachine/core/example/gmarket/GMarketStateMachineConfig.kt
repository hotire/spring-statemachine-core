package com.github.hotire.spring.statemachine.core.example.gmarket

import org.springframework.context.annotation.Configuration
import org.springframework.statemachine.config.StateMachineConfigurerAdapter

@Configuration
class GMarketStateMachineConfig : StateMachineConfigurerAdapter<States, Events>()
